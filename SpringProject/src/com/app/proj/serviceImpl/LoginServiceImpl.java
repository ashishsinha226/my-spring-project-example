package com.app.proj.serviceImpl;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.proj.beans.LoginUserBean;
import com.app.proj.exception.LoginException;
import com.app.proj.service.LoginService;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginUserBean		loginServiceProvider;
	private static final Logger	logger	= Logger.getLogger(LoginServiceImpl.class);

	@Override
	public boolean loginValidation(String username, String password) throws Exception {
		boolean result = false;
		String user = loginServiceProvider.getUser();
		if (!user.contains(username)) {
			logger.info("No user found.");
			LoginException exception = new LoginException();
			exception.setMessage("User not found.");
			throw exception;
		} else {
			String[] split = user.split(",");
			for (String usrVal : split) {
				if (usrVal.contains(username)) {
					String[] pair = usrVal.split(":");
					if (pair[1].equals(password)) {
						result = true;
						logger.info("Username and password do match.");
					} else {
						result = false;
						logger.info("Username and password do not match.");
						LoginException exception = new LoginException();
						exception.setMessage("Username and password do not match.");
						throw exception;
					}
				}
			}
			return result;
		}
	}
}