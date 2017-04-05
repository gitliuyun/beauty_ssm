package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.Dictbmacunitcodetb;
import com.yingjun.ssm.entity.DictbmacunitcodetbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DictbmacunitcodetbDao {
    long countByExample(DictbmacunitcodetbExample example);

    int deleteByExample(DictbmacunitcodetbExample example);

    int deleteByPrimaryKey(Long dictbmacunitcodetbId);

    int insert(Dictbmacunitcodetb record);

    int insertSelective(Dictbmacunitcodetb record);

    List<Dictbmacunitcodetb> selectByExample(DictbmacunitcodetbExample example);

    Dictbmacunitcodetb selectByPrimaryKey(Long dictbmacunitcodetbId);

    int updateByExampleSelective(@Param("record") Dictbmacunitcodetb record, @Param("example") DictbmacunitcodetbExample example);

    int updateByExample(@Param("record") Dictbmacunitcodetb record, @Param("example") DictbmacunitcodetbExample example);

    int updateByPrimaryKeySelective(Dictbmacunitcodetb record);

    int updateByPrimaryKey(Dictbmacunitcodetb record);
}