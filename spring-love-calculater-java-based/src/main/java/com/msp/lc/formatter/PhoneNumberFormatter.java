package com.msp.lc.formatter;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.msp.lc.api.Phone;

public class PhoneNumberFormatter implements Formatter<Phone>{

	@Override
	public String print(Phone object, Locale locale) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Phone parse(String compleatPhoneNumber, Locale locale) throws ParseException {
		// TODO Auto-generated method stub
		System.out.println("Inside the parse method of formatter");
		// Split the String received from the User
		String[] phoneNumberArray = compleatPhoneNumber.split("-");
		// Extract the CountryCode and set it to the Phone Class country code property
		Phone phone = new Phone();
		phone.setCountryCode(phoneNumberArray[0]);
		phone.setUserNumber(phoneNumberArray[1]);
		return phone;
	}

}
