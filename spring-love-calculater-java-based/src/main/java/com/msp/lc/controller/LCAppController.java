package com.msp.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.msp.lc.api.UserInfoDTO;
@Controller
public class LCAppController {
	
	@RequestMapping("/")
	public String homePage(Model model) {
		UserInfoDTO userInfo = new UserInfoDTO();
		model.addAttribute("userInfo", userInfo);
		return "home-page";
	}
	
	@RequestMapping("/proces-homepage")
	public String resultPage(UserInfoDTO userInfoDTO, Model model) {
		model.addAttribute("userinfo", userInfoDTO);
		
		return "result-page";
	}

}
