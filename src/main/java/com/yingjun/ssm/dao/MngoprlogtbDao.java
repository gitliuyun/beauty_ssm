package com.yingjun.ssm.dao;

import com.yingjun.ssm.entity.Mngoprlogtb;
import com.yingjun.ssm.entity.MngoprlogtbExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MngoprlogtbDao {
    long countByExample(MngoprlogtbExample example);

    int deleteByExample(MngoprlogtbExample example);

    int deleteByPrimaryKey(Long mngoprlogtbId);

    int insert(Mngoprlogtb record);

    int insertSelective(Mngoprlogtb record);

    List<Mngoprlogtb> selectByExample(MngoprlogtbExample example);

    Mngoprlogtb selectByPrimaryKey(Long mngoprlogtbId);

    int updateByExampleSelective(@Param("record") Mngoprlogtb record, @Param("example") MngoprlogtbExample example);

    int updateByExample(@Param("record") Mngoprlogtb record, @Param("example") MngoprlogtbExample example);

    int updateByPrimaryKeySelective(Mngoprlogtb record);

    int updateByPrimaryKey(Mngoprlogtb record);
}