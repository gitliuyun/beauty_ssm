package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.Dicttsmunitcodetb;
import com.yingjun.ssm.entity.DicttsmunitcodetbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DicttsmunitcodetbDao {
    long countByExample(DicttsmunitcodetbExample example);

    int deleteByExample(DicttsmunitcodetbExample example);

    int deleteByPrimaryKey(Long dicttsmunitcodetbId);

    int insert(Dicttsmunitcodetb record);

    int insertSelective(Dicttsmunitcodetb record);

    List<Dicttsmunitcodetb> selectByExample(DicttsmunitcodetbExample example);

    Dicttsmunitcodetb selectByPrimaryKey(Long dicttsmunitcodetbId);

    int updateByExampleSelective(@Param("record") Dicttsmunitcodetb record, @Param("example") DicttsmunitcodetbExample example);

    int updateByExample(@Param("record") Dicttsmunitcodetb record, @Param("example") DicttsmunitcodetbExample example);

    int updateByPrimaryKeySelective(Dicttsmunitcodetb record);

    int updateByPrimaryKey(Dicttsmunitcodetb record);
}