package com.aurora.arcadia.service;

import com.aurora.arcadia.model.Love;

import java.util.Collection;

public interface LoveService {

	/**
	 * 根据用户名查询用户ID
	 * @param username
	 * @return
	 */
	Integer getUserByName(String username);

	/**
	 * 根据用户ID查询用户在表白墙的信息
	 * @param userId
	 * @return
	 */
	Love getLoveById(Integer userId);

	Collection<Integer> getAllLoveUserId();

}
