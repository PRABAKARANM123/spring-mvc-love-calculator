package com.msp.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
public class LCAppController {
	
	@RequestMapping("/")
	public String homePage() {
		return "home-page";
	}
	
	@RequestMapping("/proces-homepage")
	public String resultPage(@RequestParam("userName") String userName1,
							 @RequestParam("crushName") String crushName1, Model model) {
		model.addAttribute("userName", userName1);
		model.addAttribute("crushName", crushName1);
		
		return "result-page";
	}

}
