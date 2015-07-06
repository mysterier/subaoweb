package com.subaozuche.controller.admin;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.subaozuche.model.AdminLoginForm;

@Controller
@RequestMapping("admin120")
public class LoginController {
	private static Logger logger = LoggerFactory.getLogger(LoginController.class);

	@RequestMapping(value = { "/", "login" }, method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("loginForm", new AdminLoginForm());
		return "admin/login";
	}

	@RequestMapping(value = { "/", "login" }, method = RequestMethod.POST)
	public String loginDo(@ModelAttribute("form") AdminLoginForm form) {
		logger.debug("Name is  ===== " + form.getUserName(), form.getUserName());
		return "redirect:album";
	}

}
