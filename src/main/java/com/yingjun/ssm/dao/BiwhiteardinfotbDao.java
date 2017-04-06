package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.Biwhiteardinfotb;

public interface BiwhiteardinfotbDao {
    int deleteByPrimaryKey(Long biwhitecardinfotbId);

    int insert(BiwhiteardinfotbDao record);

    int insertSelective(BiwhiteardinfotbDao record);

    BiwhiteardinfotbDao selectByPrimaryKey(Long biwhitecardinfotbId);

    int updateByPrimaryKeySelective(BiwhiteardinfotbDao record);

    int updateByPrimaryKey(BiwhiteardinfotbDao record);
}