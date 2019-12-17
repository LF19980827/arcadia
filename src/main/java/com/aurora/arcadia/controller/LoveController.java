package com.aurora.arcadia.controller;

import com.aurora.arcadia.model.Love;
import com.aurora.arcadia.service.LoveService;
import com.aurora.arcadia.vo.Constants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.*;

public class LoveController {

	@Autowired
	private LoveService loveService;

	@GetMapping("/confess")
	public String confess(Model model, HttpSession session) {
		Object attribute = session.getAttribute(Constants.SESSION_USERID);
		model.addAttribute("userId", attribute);

		List<Integer> loveIds = loveService.getAllLoveId();
		List loves = new ArrayList();
		for (Integer loveId : loveIds) {
			Love love = loveService.getLoveById(loveId);
			String loveUserName = loveService.getUserMessageById(loveId).getuName();
			love.setLoveUser(loveUserName);
			loves.add(love);
		}
		model.addAttribute("loves", loves);

		return "revealFeelings/confess";
	}

	@GetMapping("/confessRelease/{userId}")
	public String toConfessRelease(@PathVariable("userId") Integer userId, Model model) {
		String loveUserName = loveService.getUserMessageById(userId).getuName();
		model.addAttribute("loveUserName", loveUserName);
		model.addAttribute("userId", userId);
		return "revealFeelings/confessRelease";
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
