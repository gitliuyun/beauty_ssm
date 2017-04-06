package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.Biwhiteardinfotb;

public interface BiwhiteardinfotbDao {
    int deleteByPrimaryKey(Long biwhitecardinfotbId);

    int insert(Biwhiteardinfotb record);

    int insertSelective(Biwhiteardinfotb record);

    BiwhiteardinfotbDao selectByPrimaryKey(Long biwhitecardinfotbId);

    int updateByPrimaryKeySelective(Biwhiteardinfotb record);

    int updateByPrimaryKey(Biwhiteardinfotb record);
}