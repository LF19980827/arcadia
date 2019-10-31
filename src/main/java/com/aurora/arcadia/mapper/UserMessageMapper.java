package com.aurora.arcadia.mapper;

import com.aurora.arcadia.model.UserMessage;
import com.aurora.arcadia.model.UserMessageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserMessageMapper {
    long countByExample(UserMessageExample example);

    int deleteByExample(UserMessageExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(UserMessage record);

    int insertSelective(UserMessage record);

    List<UserMessage> selectByExample(UserMessageExample example);

    UserMessage selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") UserMessage record, @Param("example") UserMessageExample example);

    int updateByExample(@Param("record") UserMessage record, @Param("example") UserMessageExample example);

    int updateByPrimaryKeySelective(UserMessage record);

    int updateByPrimaryKey(UserMessage record);
}