package com.yingjun.ssm.web;

import com.yingjun.ssm.dao.BiwhiteardinfotbDao;
import com.yingjun.ssm.dao.DictbmacunitcodetbDao;
import com.yingjun.ssm.dao.DictshopcodetbDao;
import com.yingjun.ssm.dao.MachineinfoDao;
import com.yingjun.ssm.dao.TjtsmcardtxnjrltbDao;
import com.yingjun.ssm.entity.Biwhiteardinfotb;
import com.yingjun.ssm.entity.Dictbmacunitcodetb;
import com.yingjun.ssm.entity.Dictshopcodetb;
import com.yingjun.ssm.entity.Machineinfo;
import com.yingjun.ssm.entity.Tjtsmcardtxnjrltb;
import com.yingjun.ssm.entity.WhiteListSummary;
import com.yingjun.ssm.service.FileImportService;
import com.yingjun.ssm.service.TransactionAnalyzeService;
import com.yingjun.ssm.util.FileReadUtil;
import com.yingjun.ssm.util.VOTransferUtil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/infoManage")
public class InfoManageController {

    private final Logger LOG = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private DictshopcodetbDao dictshopcodetbDao;
    
    @Autowired
    private BiwhiteardinfotbDao biwhiteardinfotbDao;
    
    @Autowired
    private TjtsmcardtxnjrltbDao tjtsmcardtxnjrltbDao;
    
    @Autowired
    private DictbmacunitcodetbDao dictbmacunitcodetbDao;
    
    @Autowired
    private MachineinfoDao machineinfoDao;
    
    @Autowired
    private FileImportService fileImportService;
    
    @Autowired
    private TransactionAnalyzeService transactionAnalyzeService;
    
    /**
     * 商户信息
     * @param model
     * @return
     */
    @RequestMapping(value = "/shopList", method = RequestMethod.POST)
    public String shopList(Model model) {
        LOG.info("invoke----------/infoManage/shopList");
        List<Dictshopcodetb> list = dictshopcodetbDao.queryByCondition();
        model.addAttribute("shopList", list);
        return "shopList";
    }
    
    @RequestMapping(value = "/detailList", method = RequestMethod.POST)
    public String detailList(Model model, String deviceType) {
        LOG.info("invoke----------/infoManage/detailList");
        List<WhiteListSummary> detailList =  tjtsmcardtxnjrltbDao.getDeviceDetail(deviceType);
        model.addAttribute("detailList", VOTransferUtil.transferVOForShow(detailList));
        return "detailList";
    }
    
    /**
     * 开卡信息
     * @param model
     * @return
     */
    @RequestMapping(value = "/cardList", method = RequestMethod.POST)
    public String cardList(Model model) {
    	LOG.info("invoke----------/infoManage/cardList");
        List<Biwhiteardinfotb> list = biwhiteardinfotbDao.queryByCondition();
        model.addAttribute("cardList", list);
    	return "cardList";
    }
    
    /**
     * 交易信息
     * @param model
     * @return
     */
    @RequestMapping(value = "/transactionList", method = RequestMethod.POST)
    public String transactionList(Model model) {
    	LOG.info("invoke----------/infoManage/transactionList");
        List<Tjtsmcardtxnjrltb> list = tjtsmcardtxnjrltbDao.queryByCondition();
        model.addAttribute("transactionList", list);
    	return "transactionList";
    }
    
    /**
     * 单位字典
     * @param model
     * @return
     */
    @RequestMapping(value = "/dictionaryList", method = RequestMethod.POST)
    public String dictionaryList(Model model) {
    	LOG.info("invoke----------/infoManage/dictionaryList");
        List<Dictbmacunitcodetb> list = dictbmacunitcodetbDao.queryByCondition();
        model.addAttribute("dictionaryList", list);
    	return "dictionaryList";
    }
    
    /**
     * 白名单列表
     * @param model
     * @return
     */
    @RequestMapping(value = "/machineList", method = RequestMethod.POST)
    public String machineList(Model model) {
    	LOG.info("invoke----------/infoManage/machineList");
        List<Machineinfo> list = machineinfoDao.queryByCondition();
        model.addAttribute("machineList", list);
    	return "machineList";
    }
    
    /**
     * 分析机型使用情况
     * @param model
     * @param deviceType
     * @return
     */
    @RequestMapping(value = "/analyze", method = RequestMethod.POST)
    public String analyze(Model model, String deviceType) {
        LOG.info("invoke----------/infoManage/analyze");
        transactionAnalyzeService.analyzeMachine(deviceType);
    	return "machineList";
    }
    
    @RequestMapping(value = "/analyzeAll", method = RequestMethod.POST)
    public String analyzeAll(Model model) {
        LOG.info("invoke----------/infoManage/analyze");
        transactionAnalyzeService.analyzeMachineAll();
    	return "machineList";
    }
    
    /**
     * 饼图
     * @param model
     * @return
     */
    @RequestMapping(value = "/pieChart", method = RequestMethod.POST)
    public String pieChart(Model model) {
    	/*[{
            label: "苹果",
            data: 30
        }, {
            label: "三星",
            data: 30
        }, {
            label: "华为",
            data: 20
        }, {
            label: "小米",
            data: 15
        }, {
            label: "其他",
            data: 5
        }
        ];*/
    	
    	List<Machineinfo> info = machineinfoDao.countCardNumberOfMachine();
    	Integer total = machineinfoDao.countTotalCardNumber();
    	StringBuffer sb = new StringBuffer();
    	sb.append("[");
    	for (Machineinfo mf:info) {
    		//sb.append("{label:" +  + "}");
    	}
    	
    	sb.append("]");
    	
    	LOG.info("invoke----------/infoManage/pieChart");
    	return "pieChart";
    }
    
    /**
     * 文件导入
     * @param model
     * @return
     */
    @RequestMapping(value = "/fileImport", method = RequestMethod.POST)
    public String fileImport(Model model) {
    	LOG.info("invoke----------/infoManage/fileImport");
    	return "fileImport";
    }
    
    /*
     *采用spring提供的上传文件的方法
     */
    @RequestMapping("springUpload")
    public String  springUpload(HttpServletRequest request, String fileType) throws IllegalStateException, 
    	IOException, CloneNotSupportedException, ParseException
    {
    	System.out.println(fileType);
        long  startTime = System.currentTimeMillis();
        //将当前上下文初始化给  CommonsMutipartResolver （多部分解析器）
        CommonsMultipartResolver multipartResolver = new CommonsMultipartResolver(
                request.getSession().getServletContext());
        //检查form中是否有enctype="multipart/form-data"
        if(multipartResolver.isMultipart(request))
        {
        	//得到上传文件的保存目录，将上传的文件存放于WEB-INF目录下，不允许外界直接访问，保证上传文件的安全
        	String savePath = request.getSession().getServletContext().getRealPath("/WEB-INF/upload");
            //将request变成多部分request
            MultipartHttpServletRequest multiRequest = (MultipartHttpServletRequest)request;
            //获取multiRequest 中所有的文件名
            Iterator iter = multiRequest.getFileNames();
             
            while(iter.hasNext())
            {
                //一次遍历所有文件
                MultipartFile uploadFile = multiRequest.getFile(iter.next().toString());
                if(uploadFile != null)
                {
                	String filePath = savePath + "/" + uploadFile.getOriginalFilename();
                    //上传
                	File file = new File(filePath);
                    uploadFile.transferTo(file);
                    List<List<Object>> list = null;
                    switch (fileType) {
					case "shop":
						list = FileReadUtil.readFile(file);
						fileImportService.importShopInfo(list);
						break;
					case "unit":
						list = FileReadUtil.readFile(file);
						fileImportService.importUnitInfo(list);
						break;
					case "transaction":
						fileImportService.importTransactionInfo(file);
						break;
					case "card":
						list = FileReadUtil.readFile(file);
						fileImportService.importCardInfo(list);
						break;
					default:
						break;
					}
                }
                 
            }
           
        }
        long  endTime = System.currentTimeMillis();
        System.out.println("方法三的运行时间：" + String.valueOf(endTime - startTime) + "ms");
        return "fileImport"; 
    }

}
