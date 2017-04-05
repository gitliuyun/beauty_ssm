package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.Mngusertb;
import com.yingjun.ssm.entity.MngusertbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MngusertbDao {
    long countByExample(MngusertbExample example);

    int deleteByExample(MngusertbExample example);

    int deleteByPrimaryKey(Long mngusertbId);

    int insert(Mngusertb record);

    int insertSelective(Mngusertb record);

    List<Mngusertb> selectByExample(MngusertbExample example);

    Mngusertb selectByPrimaryKey(Long mngusertbId);

    int updateByExampleSelective(@Param("record") Mngusertb record, @Param("example") MngusertbExample example);

    int updateByExample(@Param("record") Mngusertb record, @Param("example") MngusertbExample example);

    int updateByPrimaryKeySelective(Mngusertb record);

    int updateByPrimaryKey(Mngusertb record);
}