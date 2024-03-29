package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.entity.Counsellor;
import com.example.demo.service.counsellorservice;

@Controller
public class counsellorcontroller {

	@Autowired
	private counsellorservice counsellorsvc;
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("counsellor", new Counsellor());
		return "loginView";
	}
	
	@PostMapping("/login")
	public String handleLogin(Counsellor c, Model model) {
		Counsellor obj = counsellorsvc.logincheck(c.getEmail(), c.getPwd());
		if (obj==null) {
			model.addAttribute("errMsg", "Invalid Credentials") ;
			return "loginView";
		}
		return "redirect:dashboard";
	}
	
	public String buildDashboard(Model model) {
		model.addAttribute("counsellor", new Counsellor());
		return "dashboardView";
	}
	
	@GetMapping("/register")
	public String regView(Model model) {
		model.addAttribute("counsellor", new Counsellor());
		return "registerView";
	}
	@PostMapping("/register")
	public String handleRegistration( Counsellor c, Model model) {
		String msg = counsellorsvc.saveCounsellor(c);
		model.addAttribute("msg", msg);
		return "registerView";
	}
	
	
	@GetMapping("/forgot-pwd")
	public String recoverPwdPage(Model model) {
		return "forgotPwdView";
	}
	
	@GetMapping("/recover-pwd")
	public String recoverPwd(@RequestParam String email, Model model) {
		boolean status = counsellorsvc.recoverPwd(email);
		if(status) {
			model.addAttribute("smsg", "Pwd sent to email");
		}else {
			model.addAttribute("errmsg", "Invalid Email");
		}
		return "forgotPwdView";
	}
	
}
