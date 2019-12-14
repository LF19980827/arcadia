package com.aurora.arcadia.service;

import com.aurora.arcadia.model.Love;
import com.aurora.arcadia.model.UserMessage;

import java.util.List;

public interface LoveService {

	/**
	 * 根据用户ID查询用户信息
	 * @param userId
	 * @return
	 */
	UserMessage getUserMessageById(Integer userId);

	/**
	 * 根据loveId查询这条表白墙信息
	 * @param userId
	 * @return
	 */
	Love getLoveById(Integer userId);

	/**
	 * 查询表白墙中所有的id
	 * @return
	 */
	List<Integer> getAllLoveId();

	/**
	 * 存储用户及相关信息到表白墙
	 * @param love
	 * @return
	 */
	boolean saveLove(Love love);

	/**
	 * 设置点赞数
	 * @param loveSign
	 */
	void setLoveSign(int loveId, int loveSign);

}
