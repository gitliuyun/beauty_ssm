package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.Dictshopcodetb;

public interface DictshopcodetbDao {
    int deleteByPrimaryKey(Long dictshopcodetbId);

    int insert(Dictshopcodetb record);

    int insertSelective(Dictshopcodetb record);

    Dictshopcodetb selectByPrimaryKey(Long dictshopcodetbId);

    int updateByPrimaryKeySelective(Dictshopcodetb record);

    int updateByPrimaryKey(Dictshopcodetb record);
}