package com.aurora.arcadia.mapper;

import com.aurora.arcadia.model.Club;
import com.aurora.arcadia.model.ClubExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClubMapper {
    long countByExample(ClubExample example);

    int deleteByExample(ClubExample example);

    int deleteByPrimaryKey(Integer clubId);

    int insert(Club record);

    int insertSelective(Club record);

    List<Club> selectByExample(ClubExample example);

    Club selectByPrimaryKey(Integer clubId);

    int updateByExampleSelective(@Param("record") Club record, @Param("example") ClubExample example);

    int updateByExample(@Param("record") Club record, @Param("example") ClubExample example);

    int updateByPrimaryKeySelective(Club record);

    int updateByPrimaryKey(Club record);
}