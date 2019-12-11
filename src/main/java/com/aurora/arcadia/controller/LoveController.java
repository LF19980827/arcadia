package com.aurora.arcadia.controller;

import com.aurora.arcadia.model.Love;
import com.aurora.arcadia.service.LoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.*;

public class LoveController {

	@Autowired
	private LoveService loveService;

	@GetMapping("/confess")
	public String confess(Model model) {
		List<Integer> loveUserIds = loveService.getAllLoveUserId();

		List loveUserNames = new ArrayList();
		for (Integer loveUserId : loveUserIds) {
			String loveUserName = loveService.getUserMessageById(loveUserId).getuName();
			loveUserNames.add(loveUserName);
		}
		model.addAttribute("loveUserNames", loveUserNames);

		List loveSigns = new ArrayList();
		for (Integer loveUserId : loveUserIds) {
			Integer loveSign = loveService.getLoveSignById(loveUserId);
			loveSigns.add(loveSign);
		}
		model.addAttribute("loveSigns", loveUserNames);

		return "revealFeelings/confess";
	}

	//SpringMVC自动将请求参数和参数对象内的属性进行一一绑定，但是要求请求参数名和参数对象内的属性名一样
	@PostMapping("/confessRelease")
	public String confessRelease(Love love) {
		loveService.saveLove(love);		//保存到数据库
		return "redirect:/confess";		//应该再次来到表白墙页面
	}

	@GetMapping(value = "/giveLove/{loveUserId}")
	public String giveLove(@PathVariable("loveUserId") Integer loveUserId) {
		Love love = loveService.getLoveById(loveUserId);
		int sign = love.getLoveSign();
		sign++;
		love.setLoveUserId(sign);
		loveService.saveLove(love);
		return "redirect:/confess";		//应该再次来到表白墙页面
	}

}
