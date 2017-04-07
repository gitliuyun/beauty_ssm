package com.yingjun.ssm.dao;

import java.util.List;

import com.yingjun.ssm.entity.Tjtsmcardtxnjrltb;

public interface TjtsmcardtxnjrltbDao {
    int deleteByPrimaryKey(Long tjtsmcardtxnjrltbId);

    int insert(Tjtsmcardtxnjrltb record);

    int insertSelective(Tjtsmcardtxnjrltb record);

    Tjtsmcardtxnjrltb selectByPrimaryKey(Long tjtsmcardtxnjrltbId);

    int updateByPrimaryKeySelective(Tjtsmcardtxnjrltb record);

    int updateByPrimaryKey(Tjtsmcardtxnjrltb record);
    
    List<Tjtsmcardtxnjrltb> queryByCondition();
}