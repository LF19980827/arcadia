package com.aurora.arcadia.mapper;

import com.aurora.arcadia.model.LostAndFound;
import com.aurora.arcadia.model.LostAndFoundExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LostAndFoundMapper {
    long countByExample(LostAndFoundExample example);

    int deleteByExample(LostAndFoundExample example);

    int deleteByPrimaryKey(Integer lostId);

    int insert(LostAndFound record);

    int insertSelective(LostAndFound record);

    List<LostAndFound> selectByExample(LostAndFoundExample example);

    LostAndFound selectByPrimaryKey(Integer lostId);

    int updateByExampleSelective(@Param("record") LostAndFound record, @Param("example") LostAndFoundExample example);

    int updateByExample(@Param("record") LostAndFound record, @Param("example") LostAndFoundExample example);

    int updateByPrimaryKeySelective(LostAndFound record);

    int updateByPrimaryKey(LostAndFound record);
}