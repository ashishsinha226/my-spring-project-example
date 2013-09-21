package com.app.proj.aop;

import java.lang.reflect.Method;

import org.apache.log4j.Logger;
import org.springframework.aop.MethodBeforeAdvice;

public class AopBeforeMethod implements MethodBeforeAdvice {

	private static final Logger	logger	= Logger.getLogger(AopBeforeMethod.class);

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		logger.info("\n\n*****************************************************************************************\n");
		logger.info("\tEntering method [ " + method.getName() + " ]");
		logger.debug("\tArguments are");
		for (Object object : args) {
			logger.debug("\t\tArgs " + object.toString());
		}
		logger.info("\n\n*****************************************************************************************\n\n");
	}
}