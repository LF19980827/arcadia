package com.aurora.arcadia.service;

import com.aurora.arcadia.mapper.LoveMapper;
import com.aurora.arcadia.mapper.UserMapper;
import com.aurora.arcadia.model.Love;
import com.aurora.arcadia.model.User;
import com.aurora.arcadia.model.UserMessage;
import org.springframework.beans.factory.annotation.Autowired;

public class LoveServiceImpl implements LoveService {

	@Autowired
	private LoveMapper loveMapper;
	@Autowired
	private UserMapper userMapper;

	@Override
	public Integer getUserByName(String username) {
		User user = new User(username);
		try {
			user = userMapper.selectByName(user);
			return user.getUserId();
		}catch (NullPointerException e) {
			return null;
		}
	}

	@Override
	public Love getLoveById(Integer userId) {
		return null;
	}

}
