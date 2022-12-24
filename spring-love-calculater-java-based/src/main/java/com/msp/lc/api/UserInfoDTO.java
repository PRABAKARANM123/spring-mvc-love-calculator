package com.msp.lc.api;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
	@NotBlank(message = "*Name can't be blanck")
	@Size(min = 3, max = 15, message = "*Name should have char between 3-15")
	private String userName;
	
	@NotBlank(message = "Crush Name can't be blank")
	@Size(min = 3, max = 15, message ="*Crush Name should have char between 3-15")
	private String crushName;
	
	@AssertTrue(message = "*agree to use our App")
	private boolean termsAndConditions;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getCrushName() {
		return crushName;
	}
	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}
	public boolean isTermsAndConditions() {
		return termsAndConditions;
	}
	public void setTermsAndConditions(boolean termsAndConditions) {
		this.termsAndConditions = termsAndConditions;
	}
	
	
}
