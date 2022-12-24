package com.msp.lc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
	public String resultPage(@Valid @ModelAttribute("userInfo") UserInfoDTO userinfo, BindingResult result) {
		if(result.hasErrors()) {
			//System.out.println("My form has Error..");
			return "home-page"; // if a Name is empty it does not move to 'result-page'
		}
		
		return "result-page";
	}
	
	

}
