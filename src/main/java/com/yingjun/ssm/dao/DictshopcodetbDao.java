package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.Dictshopcodetb;
import com.yingjun.ssm.entity.DictshopcodetbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictshopcodetbDao {
    long countByExample(DictshopcodetbExample example);

    int deleteByExample(DictshopcodetbExample example);

    int deleteByPrimaryKey(Long dictshopcodetbId);

    int insert(Dictshopcodetb record);

    int insertSelective(Dictshopcodetb record);

    List<Dictshopcodetb> selectByExample(DictshopcodetbExample example);

    Dictshopcodetb selectByPrimaryKey(Long dictshopcodetbId);

    int updateByExampleSelective(@Param("record") Dictshopcodetb record, @Param("example") DictshopcodetbExample example);

    int updateByExample(@Param("record") Dictshopcodetb record, @Param("example") DictshopcodetbExample example);

    int updateByPrimaryKeySelective(Dictshopcodetb record);

    int updateByPrimaryKey(Dictshopcodetb record);
}