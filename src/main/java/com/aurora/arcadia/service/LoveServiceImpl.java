package com.aurora.arcadia.service;

import com.aurora.arcadia.mapper.LoveMapper;
import com.aurora.arcadia.mapper.UserMapper;
import com.aurora.arcadia.mapper.UserMessageMapper;
import com.aurora.arcadia.model.Love;
import com.aurora.arcadia.model.UserMessage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class LoveServiceImpl implements LoveService {

	@Autowired
	private LoveMapper loveMapper;
	@Autowired
	private UserMessageMapper userMessageMapper;

	@Override
	public UserMessage getUserMessageById(Integer userId) {
		UserMessage userMessage;
		try {
			userMessage = userMessageMapper.selectByPrimaryKey(userId);
		} catch (Exception e) {
			return null;
		}
		return userMessage;
	}

	@Override
	public Love getLoveById(Integer userId) {
		Love love;
		try {
			love = loveMapper.getLoveById(userId);
		} catch (Exception e) {
			return null;
		}
		return love;
	}

	@Override
	public List<Integer> getAllLoveId() {
		List list = new ArrayList();
		try {
			list = loveMapper.getAllLoveId();
		} catch (Exception e) {
			return null;
		}
		return list;
	}

	@Override
	public boolean saveLove(Love love) {
		boolean flag;
		try {
			flag = loveMapper.saveLove(love);
		} catch (Exception e) {
			return false;
		}
		return flag;
	}

	public void setLoveSign(int loveId, int loveSign) {
		Love love = new Love();
		love.setLoveId(loveId);
		love.setLoveSign(loveSign);
		loveMapper.setLoveSign(love);
	}

}
