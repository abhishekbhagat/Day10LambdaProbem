package com.example.demo;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserValidate {
	private static final String FIRST_NAME_PATTERN = "[A-Z]{1}[a-zA-Z]{2,}";
	private static final String LAST_NAME_PATTERN = "[A-Z]{1}[a-zA-Z]{2,}";
	private static final String EMAIL_ID_PATTERN = "^[a-zA-Z]+[-+.]{0,1}[a-zA-Z0-9]+@[A-Za-z0-9]+(.[A-Za-z]{2,4}){1,2}$";
	private static final String MOBILE_NUMBER_PATTERN = "[1-9]{1}[0-9]{1}( )[1-9]{1}[0-9]{9}";
	private static final String PASSWORD_PATTERN = "(?=.*[A-Z])(?=.*[0-9])(?=.*[@#$%^&-+=()])[a-zA].{8,}$";

	public static void main(String[] args) {

		Predicate<String> validLastName = (String lastName) -> {
			boolean result = Pattern.matches(LAST_NAME_PATTERN, lastName);
			return result;
		};

		Predicate<String> validFirstName = (String firstName) -> {
			Pattern pattern = Pattern.compile(FIRST_NAME_PATTERN);
			boolean result = pattern.matcher(firstName).matches();
			return result;
		};

		Predicate<String> validEmailId = (String emailId) -> {
			boolean result = Pattern.matches(EMAIL_ID_PATTERN, emailId);
			return result;

		};

		Predicate<String> validMobileNumber = (String mobileNumber) -> {
			boolean result = Pattern.matches(MOBILE_NUMBER_PATTERN, mobileNumber);
			return result;
		};

		Predicate<String> validPassword = (String password) -> {
			boolean result = Pattern.matches(PASSWORD_PATTERN, password);
			return result;
		};
		System.out.println(validLastName.test("Bhagat"));
		System.out.println(validFirstName.test("Abhishek"));
		System.out.println(validEmailId.test("abhishek@gmail.com"));
		System.out.println(validMobileNumber.test("91 7215545545"));
		System.out.println(validPassword.test("Akdfjk12@"));
		System.out.println();
		System.out.println();

	}
}
