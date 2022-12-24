package com.msp.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.msp.lc.api.UserInfoDTO;
@Controller
public class LCAppController {
	
	@RequestMapping("/")
	public String homePage(@ModelAttribute("userInfo") UserInfoDTO userInfo) {
		
		return "home-page";
	}
	
	@RequestMapping("/proces-homepage")
	public String resultPage(@ModelAttribute("userinfo") UserInfoDTO userinfo) {
		
		return "result-page";
	}

}
