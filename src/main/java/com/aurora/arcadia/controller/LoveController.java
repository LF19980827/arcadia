package com.aurora.arcadia.controller;

import com.aurora.arcadia.model.Love;
import com.aurora.arcadia.service.LoveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.*;

public class LoveController {

	@Autowired
	private LoveService loveService;

	@GetMapping("/confess")
	public String confess(Model model) {
		List<Integer> loveUserIds = loveService.getAllLoveId();

		List loveUserNames = new ArrayList();
		for (Integer loveUserId : loveUserIds) {
			String loveUserName = loveService.getUserMessageById(loveUserId).getuName();
			loveUserNames.add(loveUserName);
		}
		model.addAttribute("loveUserNames", loveUserNames);

		List loves = new ArrayList();
		for (Integer loveUserId : loveUserIds) {
			Love love = loveService.getLoveById(loveUserId);
			loves.add(love);
		}
		model.addAttribute("loves", loves);

		return "revealFeelings/confess";
	}

	@GetMapping("/confessRelease/{loveUserId}")
	public String toConfessRelease(@PathVariable("loveUserId") Integer loveUserId, Model model) {
		String loveUserName = loveService.getUserMessageById(loveUserId).getuName();
		model.addAttribute("loveUserName", loveUserName);
		model.addAttribute("loveUserId", loveUserId);
		return "revealFeelings/confessRelease";		//应该再次来到表白墙页面
	}

	@PostMapping("/submitConfess")
	public String confessRelease(Love love) {
		loveService.saveLove(love);
		return "redirect:/confess";
	}

	@GetMapping(value = "/giveLove/{loveId}")
	public String giveLove(@PathVariable("loveId") Integer loveId) {
		Love love = loveService.getLoveById(loveId);
		int loveSign = love.getLoveSign();
		loveSign++;
		loveService.setLoveSign(loveId, loveSign);
		return "redirect:/confess";
	}

}
