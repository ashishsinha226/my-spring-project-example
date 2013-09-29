package com.app.proj.command;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.app.proj.beans.LoginBean;
import com.app.proj.entity.User;
import com.app.proj.service.LoginService;
import com.app.proj.service.UserService;
import com.app.proj.validations.LoginValidator;

@Controller
public class HomCmd {

	private static final Logger logger = Logger.getLogger(HomCmd.class);

	@Autowired
	private LoginService loginServiceProxy;

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Map<String, LoginBean> model) {
		model.put("command", new LoginBean());
		return "login/home";
	}

	@RequestMapping(value = "/login.htm", method = RequestMethod.POST)
	public String login(@ModelAttribute("command") LoginBean loginBean,
			ModelMap model, BindingResult bindingResult) throws Exception {
		{
			logger.debug("Starting test");
			List<User> listContact = userService.listContact();
			if (listContact == null) {
				logger.debug("User list is NULL>");
			} else {
				if (listContact.size() < 1) {
					logger.debug("User list has no users.");
				} else {
					for (User user : listContact) {
						logger.debug("User id \t" + user.getUser_id());
						logger.debug("User id \t" + user.getUser_id());
					}
				}
			}
		}
		LoginValidator validator = new LoginValidator();
		validator.validate(loginBean, bindingResult);
		logger.debug(loginBean.toString());
		if (bindingResult.hasErrors()) {
			model.put("command", loginBean);
			return "login/home";
		} else {
			boolean loginValidationResult = loginServiceProxy.loginValidation(
					loginBean.getUsername(), loginBean.getPassword());
			model.addAttribute("result", loginValidationResult);
			return "login/showLogin";
		}
	}
}