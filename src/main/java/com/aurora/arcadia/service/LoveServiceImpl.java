package com.aurora.arcadia.service;

import com.aurora.arcadia.mapper.LoveMapper;
import com.aurora.arcadia.mapper.UserMapper;
import com.aurora.arcadia.model.Love;
import com.aurora.arcadia.model.UserMessage;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class LoveServiceImpl implements LoveService {

	@Autowired
	private LoveMapper loveMapper;
	@Autowired
	private UserMapper userMapper;

	@Override
	public UserMessage getUserMessageById(Integer userId) {
		return null;
	}

	@Override
	public Love getLoveById(Integer userId) {
		return null;
	}

	@Override
	public List<Integer> getAllLoveUserId() {
		return null;
	}

	@Override
	public boolean saveLove(Love love) {
		return false;
	}

	@Override
	public Integer getLoveSignById(Integer loveUserId) {
		return 0;
	}

}
