package com.yingjun.ssm.dao;


import java.util.HashMap;
import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.yingjun.ssm.entity.Dictshopcodetb;

/**
 * 
 * @author yingjun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class ShopInfoDaoTest {

    @Autowired
    private DictshopcodetbDao dictshopcodetbDao;
	
	@Test
	public void testQueryById() {
		List<Dictshopcodetb> shops = dictshopcodetbDao.queryByCondition();
		for (Dictshopcodetb dictshopcodetb : shops) {
			System.out.println(dictshopcodetb.getShopname());
		}
		System.out.println("--------------------------");
	}

}
