package com.aurora.arcadia.mapper;

import com.aurora.arcadia.model.Love;
import com.aurora.arcadia.model.LoveExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoveMapper {
    long countByExample(LoveExample example);

    int deleteByExample(LoveExample example);

    int deleteByPrimaryKey(Integer loveId);

    int insert(Love record);

    int insertSelective(Love record);

    List<Love> selectByExample(LoveExample example);

    Love selectByPrimaryKey(Integer loveId);

    int updateByExampleSelective(@Param("record") Love record, @Param("example") LoveExample example);

    int updateByExample(@Param("record") Love record, @Param("example") LoveExample example);

    int updateByPrimaryKeySelective(Love record);

    int updateByPrimaryKey(Love record);
}