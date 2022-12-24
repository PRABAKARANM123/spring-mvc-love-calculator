package com.msp.lc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.msp.lc.api.UserRegistrationDTO;

@Controller()
public class RegistratonController {
	@RequestMapping("/register")
	public String showRegistrationPage(@ModelAttribute("userRege") UserRegistrationDTO dto) {
		dto.setName("Prabakaran");
		dto.setUserName("msp123");
		
		return "user-registration-page";
	}
	
	@RequestMapping("/registration-sucess")
	public String processUserReg(@ModelAttribute("userReg") UserRegistrationDTO dto) {
		return "registration-sucess";
	}

}
