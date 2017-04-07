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

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

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
     * 饼图
     * @param model
     * @return
     */
    @RequestMapping(value = "/pieChart", method = RequestMethod.POST)
    public String pieChart(Model model) {
    	LOG.info("invoke----------/infoManage/pieChart");
    	return "pieChart";
    }

}
