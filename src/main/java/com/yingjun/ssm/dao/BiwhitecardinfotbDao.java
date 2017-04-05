package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.Biwhitecardinfotb;
import com.yingjun.ssm.entity.BiwhitecardinfotbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BiwhitecardinfotbDao {
    long countByExample(BiwhitecardinfotbExample example);

    int deleteByExample(BiwhitecardinfotbExample example);

    int deleteByPrimaryKey(Long biwhitecardinfotbId);

    int insert(Biwhitecardinfotb record);

    int insertSelective(Biwhitecardinfotb record);

    List<Biwhitecardinfotb> selectByExample(BiwhitecardinfotbExample example);

    Biwhitecardinfotb selectByPrimaryKey(Long biwhitecardinfotbId);

    int updateByExampleSelective(@Param("record") Biwhitecardinfotb record, @Param("example") BiwhitecardinfotbExample example);

    int updateByExample(@Param("record") Biwhitecardinfotb record, @Param("example") BiwhitecardinfotbExample example);

    int updateByPrimaryKeySelective(Biwhitecardinfotb record);

    int updateByPrimaryKey(Biwhitecardinfotb record);
}