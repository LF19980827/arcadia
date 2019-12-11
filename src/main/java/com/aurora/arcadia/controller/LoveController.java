package com.aurora.arcadia.controller;

import com.aurora.arcadia.model.Love;
import com.aurora.arcadia.model.User;
import com.aurora.arcadia.service.LoveService;
import com.aurora.arcadia.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class LoveController {

	@Autowired
	private LoveService loveService;

	@PostMapping(value = "/giveLike")
	public Map<String, Object> giveLike(@RequestParam(value = "username", required = true) String username,
									 HttpSession session) {
		int id = loveService.getUserByName(username);
		Love love = loveService.getLoveById(id);
		int sign = love.getLoveSign();
		sign++;
		love.setLoveUserId(sign);

	}

	@GetMapping("/confess")
	public String list(Model model) {
		Collection<Love> loves = loveService.selectByPrimaryKey();
		//存入请求域中，请求域：Modal，ModalMap，Map
		model.addAttribute("love", loves);
		return "emp/list";
	}


	@GetMapping("/emp")
	public String toAddPage(Model model) {
		//查出所有部门，在添加页面显示
		Collection<Department> departments = departmentDao.getDepartments();
		model.addAttribute("depts", departments);
		return "emp/add";
	}

	//SpringMVC自动将请求参数和参数对象内的属性进行一一绑定，但是要求请求参数名和参数对象内的属性名一样
	@PostMapping("/emp")
	public String addEmp(Employee employee) {
		//保存员工到数据库
		employeeDao.save(employee);
		//添加完成应该再次来到员工列表页面
		//redirect: 表示重定向到一个地址---/代表当前项目路径
		//forward: 表示转发到一个地址
		return "redirect:/emps";
	}

}
