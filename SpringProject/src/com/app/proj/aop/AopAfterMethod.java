package com.app.proj.aop;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.AfterReturningAdvice;

public class AopAfterMethod implements AfterReturningAdvice {

	private static final Logger	logger	= Logger.getLogger(AopAfterMethod.class);

	@Override
	public void afterReturning(Object returnValue, Method method, Object[] args, Object target) throws Throwable {
		logger.info("\n\n*****************************************************************************************\n");
		logger.debug("\tReturnValue is " + returnValue.toString());
		logger.debug("\tArguments are");
		for (Object object : args) {
			logger.debug("\t\tArgs " + object.toString());
		}
		logger.info("\tLeaving method [ " + method.getName() + " ]");
		logger.info("\n\n*****************************************************************************************\n\n");
	}
}