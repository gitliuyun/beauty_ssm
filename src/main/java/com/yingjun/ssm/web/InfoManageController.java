package com.yingjun.ssm.web;

import com.yingjun.ssm.dao.DictshopcodetbDao;
import com.yingjun.ssm.entity.Dictshopcodetb;
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
    
    @RequestMapping(value = "/shopList", method = RequestMethod.POST)
    public String shopList(Model model) {
        LOG.info("invoke----------/infoManage/shopList");
        List<Dictshopcodetb> list = dictshopcodetbDao.queryByCondition();
        model.addAttribute("shopList", list);
        return "shopList";
    }

}
