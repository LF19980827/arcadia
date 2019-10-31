package com.aurora.arcadia.mapper;

import com.aurora.arcadia.model.Attention;
import com.aurora.arcadia.model.AttentionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AttentionMapper {
    long countByExample(AttentionExample example);

    int deleteByExample(AttentionExample example);

    int deleteByPrimaryKey(Integer attId);

    int insert(Attention record);

    int insertSelective(Attention record);

    List<Attention> selectByExample(AttentionExample example);

    Attention selectByPrimaryKey(Integer attId);

    int updateByExampleSelective(@Param("record") Attention record, @Param("example") AttentionExample example);

    int updateByExample(@Param("record") Attention record, @Param("example") AttentionExample example);

    int updateByPrimaryKeySelective(Attention record);

    int updateByPrimaryKey(Attention record);
}