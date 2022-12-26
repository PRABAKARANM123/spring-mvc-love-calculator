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
		Phone phone = new Phone();

		System.out.println("Inside the parse method of  the PhoneNumberFormatter");
		// Split the String received from the User
		String[] phoneNumberArray = compleatPhoneNumber.split("-");
		// Extract the CountryCode and set it to the Phone Class country code property

		// whether the number consist of -
		int index = compleatPhoneNumber.indexOf('-');
		if (index == -1 || compleatPhoneNumber.startsWith("-")) {
			// if the '-' not found, then add 91 as the default country code
			phone.setCountryCode("91");
			if (compleatPhoneNumber.startsWith("-")) {

				phone.setUserNumber(phoneNumberArray[1]);
			} else {

				phone.setCountryCode(phoneNumberArray[0]);

			}
		} else {
			phone.setCountryCode(phoneNumberArray[0]);
			phone.setUserNumber(phoneNumberArray[1]);
		}
		return phone;
	}

}
