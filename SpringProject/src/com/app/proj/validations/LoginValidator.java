package com.app.proj.validations;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.app.proj.beans.LoginBean;

public class LoginValidator implements Validator {

	@Override
	public boolean supports(@SuppressWarnings("rawtypes") Class clazz) {
		return LoginBean.class.equals(clazz);
	}

	@SuppressWarnings("unused")
	@Override
	public void validate(Object target, Errors errors) {
		LoginBean loginBean = (LoginBean) target;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "required.userName", "Required field");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "required.password", "Required field");
	}
}