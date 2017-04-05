package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.Tjtsmcardtxnjrltb;
import com.yingjun.ssm.entity.TjtsmcardtxnjrltbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TjtsmcardtxnjrltbDao {
    long countByExample(TjtsmcardtxnjrltbExample example);

    int deleteByExample(TjtsmcardtxnjrltbExample example);

    int deleteByPrimaryKey(Long tjtsmcardtxnjrltbId);

    int insert(Tjtsmcardtxnjrltb record);

    int insertSelective(Tjtsmcardtxnjrltb record);

    List<Tjtsmcardtxnjrltb> selectByExample(TjtsmcardtxnjrltbExample example);

    Tjtsmcardtxnjrltb selectByPrimaryKey(Long tjtsmcardtxnjrltbId);

    int updateByExampleSelective(@Param("record") Tjtsmcardtxnjrltb record, @Param("example") TjtsmcardtxnjrltbExample example);

    int updateByExample(@Param("record") Tjtsmcardtxnjrltb record, @Param("example") TjtsmcardtxnjrltbExample example);

    int updateByPrimaryKeySelective(Tjtsmcardtxnjrltb record);

    int updateByPrimaryKey(Tjtsmcardtxnjrltb record);
}