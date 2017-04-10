package com.yingjun.ssm.service.impl;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.LineIterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yingjun.ssm.dao.BiwhiteardinfotbDao;
import com.yingjun.ssm.dao.DictshopcodetbDao;
import com.yingjun.ssm.dao.MachineinfoDao;
import com.yingjun.ssm.dao.TjtsmcardtxnjrltbDao;
import com.yingjun.ssm.entity.Biwhiteardinfotb;
import com.yingjun.ssm.entity.Dictshopcodetb;
import com.yingjun.ssm.entity.Machineinfo;
import com.yingjun.ssm.entity.Tjtsmcardtxnjrltb;
import com.yingjun.ssm.service.FileImportService;
import com.yingjun.ssm.util.TimeUtils;
@Service
public class FileImportServiceImpl implements FileImportService {
	@Autowired
	private DictshopcodetbDao dictshopcodetbDao;
	
	@Autowired
	private BiwhiteardinfotbDao biwhiteardinfotbDao;
	
	@Autowired
	private TjtsmcardtxnjrltbDao tjtsmcardtxnjrltbDao;
	
	@Autowired
	private MachineinfoDao machineinfoDao;
	
	@Override
	public String importShopInfo(List<List<Object>> list) {
		for (int i = 1; i < list.size(); i++) {
			Dictshopcodetb shop = new Dictshopcodetb();
			List<Object> row = list.get(i);
			shop.setShopno(row.get(0).toString());
			shop.setRsvd(row.get(1).toString());
			shop.setShopname(row.get(2).toString());
			dictshopcodetbDao.insert(shop);
		}
		return "OK";
	}

	@Override
	public String importCardInfo(List<List<Object>> list) throws ParseException {
		List<String> existDeviceTypes =  machineinfoDao.queryAllDeviceType();
		List<String> existCardNos = biwhiteardinfotbDao.queryAllCardNo();
		Set<String> deviceSet = new HashSet<>();
		for (int i = 1; i < list.size(); i++) {
			List<Object> row = list.get(i);
			if (!existCardNos.contains(row.get(1).toString())) {
				Biwhiteardinfotb card = new Biwhiteardinfotb();
				card.setProductmodel(row.get(10).toString());
				card.setCardno(row.get(1).toString());
				//发卡日期
				card.setRsvd(row.get(4).toString());
				card.setKktype(row.get(5).toString());
				card.setUnitcode(row.get(6).toString());
				card.setMobileno(row.get(7).toString());
				card.setProductcompany(row.get(8).toString());
				
				if (!existDeviceTypes.contains(card.getProductmodel()) && !deviceSet.contains(card.getProductmodel())) {
					Machineinfo info = new Machineinfo();
					info.setDevicetype(card.getProductmodel());
					info.setDevicecompany(card.getProductcompany());
					info.setRecordtime(TimeUtils.getDateFromString(card.getRsvd()));
					machineinfoDao.insert(info);
					deviceSet.add(card.getProductmodel());
				}
				biwhiteardinfotbDao.insert(card);
			}
		}
		return "OK";
	}

	@Override
	public String importTransactionInfo(File file) throws IOException, CloneNotSupportedException {
		Tjtsmcardtxnjrltb tj = new Tjtsmcardtxnjrltb();
		tj.setFileid(file.getName());
		LineIterator it = FileUtils.lineIterator(file, "UTF-8");
		try {
		    while (it.hasNext()) {
		    	String fileHead = it.nextLine();
		    	tj.setFilever(fileHead.substring(0, 2));
		    	tj.setBirthdate(fileHead.substring(2,10));
		        break;
		    }
		    Integer count = 0;
		    List<Biwhiteardinfotb> existInfo = biwhiteardinfotbDao.queryAllCardInfo();
		    while (it.hasNext()) {
		    	Tjtsmcardtxnjrltb temp = (Tjtsmcardtxnjrltb)tj.clone();
		        String line = it.nextLine();
		        temp.setFileno(count.toString());
		        temp.setCardno(line.substring(0, 16));
		        temp.setCardtype(line.substring(16, 17));
		        temp.setTransdate(line.substring(17, 25));
		        temp.setTranstype(line.substring(25, 26));
		        temp.setTotalnum(Integer.parseInt(line.substring(26,34)));
		        temp.setTotalsum(Integer.parseInt(line.substring(34, 42)));
		        temp.setIndustrycode(line.substring(42, 46));
		        temp.setUnitid(line.substring(46, 54));
		        temp.setUnitcode("YD");
		        temp.setUnitno("YD");
		        temp.setShopno(line.substring(54, 66));
		        for (Biwhiteardinfotb info:existInfo) {
		        	if (info.getCardno().equals(temp.getCardno())) {
		        		temp.setMobileno(info.getMobileno());
		        		temp.setProductcompany(info.getProductcompany());
		        		temp.setProductmodel(info.getProductmodel());
		        		break;
		        	}
		        }
		        
		        tjtsmcardtxnjrltbDao.insert(temp);
		        count ++;
		    }
		} finally {
		    it.close();
		}
		return "OK";
	}

}
