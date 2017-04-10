package com.yingjun.ssm.dao;


import java.util.List;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * 
 * @author yingjun
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring/spring-dao.xml")
public class ShopInfoDaoTest {

    @Autowired
    private BiwhiteardinfotbDao biwhiteardinfotbDao;
	
	@Test
	public void testQueryById() {
		List<String> existCardNos = biwhiteardinfotbDao.queryAllCardNo();
		System.out.println(existCardNos);
	}

}
