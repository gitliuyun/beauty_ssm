package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.Dictbmacunitcodetb;

public interface DictbmacunitcodetbDao {
    int deleteByPrimaryKey(Long dictbmacunitcodetbId);

    int insert(Dictbmacunitcodetb record);

    int insertSelective(Dictbmacunitcodetb record);

    Dictbmacunitcodetb selectByPrimaryKey(Long dictbmacunitcodetbId);

    int updateByPrimaryKeySelective(Dictbmacunitcodetb record);

    int updateByPrimaryKey(Dictbmacunitcodetb record);
}