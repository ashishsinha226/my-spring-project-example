package com.app.proj.aop;

import org.apache.log4j.Logger;
import org.springframework.aop.ThrowsAdvice;

import com.app.proj.exception.AppException;
import com.app.proj.exception.LoginException;

import java.lang.reflect.Method;

public class AopExceptionThrown implements ThrowsAdvice {

	private static final Logger	logger	= Logger.getLogger(AopExceptionThrown.class);

	public void afterThrowing(Method method, Object[] args, Object target, Exception ex) {
		logger.fatal("\n\n*****************************************************************************************\n");

		if (ex instanceof AppException) {
			logger.fatal("[ AppException ] Exception id is " + ((AppException) ex).getId());
		}

		if (ex instanceof LoginException) {
			logger.fatal("[ LoginException ] Exception id is " + ((LoginException) ex).getId());
		}
		logger.fatal("Exception occurred at " + method.getName());
		logger.fatal("Arguments are");
		for (Object object : args) {
			logger.fatal("Args " + object.toString());
		}
		logger.fatal("Exception message is " + ex.getMessage());

		logger.fatal("\n\n*****************************************************************************************\n\n");
	}
}