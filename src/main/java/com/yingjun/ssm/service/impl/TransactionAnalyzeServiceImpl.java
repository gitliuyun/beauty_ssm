package com.yingjun.ssm.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yingjun.ssm.dao.MachineinfoDao;
import com.yingjun.ssm.dao.TjtsmcardtxnjrltbDao;
import com.yingjun.ssm.entity.Machineinfo;
import com.yingjun.ssm.entity.WhiteListSummary;
import com.yingjun.ssm.service.TransactionAnalyzeService;
import com.yingjun.ssm.util.TimeUtils;
@Service
public class TransactionAnalyzeServiceImpl implements TransactionAnalyzeService {

	@Autowired
	private TjtsmcardtxnjrltbDao tjtsmcardtxnjrltbDao;
	
	@Autowired
	private MachineinfoDao machineinfoDao;
	
	@Override
	public void analyzeMachine(String machineType) {
		List<WhiteListSummary> list = tjtsmcardtxnjrltbDao.getDeviceDetail(machineType);
		Machineinfo info = machineinfoDao.queryByMachineType(machineType);
		Integer busNumber = 0;
		Integer subWayNumber = 0;
		info.setCardnumber(tjtsmcardtxnjrltbDao.countOpenCardNo(machineType));
		for (WhiteListSummary ws:list) {
			switch (ws.getIndustrycode()) {
			case "7510":
				busNumber ++;
				break;
			case "7513":
				subWayNumber ++;
				break;
			default:
				break;
			}
		}
		info.setBusnumber(busNumber);
		info.setSubwaynumber(subWayNumber);
		if (busNumber + subWayNumber < list.size()) {
			info.setUsedinotherindustry("是");
		} else {
			info.setUsedinotherindustry("否");
		}
		info.setHascomplain("否");
		
		//判断是否符合转正式名单条件
		info.setIsformal("否");
		if (busNumber >= 10 && subWayNumber >= 10 && "是".equals(info.getUsedinotherindustry()) && "否".equals(info.getHascomplain())) {
			Long month = TimeUtils.getTimeFormatText(info.getRecordtime());
			if (month >= 3 && info.getCardnumber() > 40) {
				info.setIsformal("是");
			}
			if (month >= 1 && month < 3 && info.getCardnumber() > 50) {
				info.setIsformal("是");
			}
		}
		machineinfoDao.updateByPrimaryKey(info);
	}
	
	@Override
	public void analyzeMachineAll() {
		List<String> allMachine = machineinfoDao.queryAllDeviceType();
		for (String s:allMachine) {
			analyzeMachine(s);
		}
	}

}
