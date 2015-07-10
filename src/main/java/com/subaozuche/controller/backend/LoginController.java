package com.subaozuche.controller.backend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.subaozuche.model.AdminLoginForm;

@Controller
@RequestMapping("backend")
public class LoginController {
	private static final String VIEW_DIR = "backend/";
	private static Logger logger = LoggerFactory
			.getLogger(LoginController.class);
	private ModelAndView view = new ModelAndView();

	@RequestMapping(value = { "/", "login" }, method = RequestMethod.GET)
	public String login(Model model) {
		model.addAttribute("loginForm", new AdminLoginForm());
		return "backend/login";
	}

	@RequestMapping(value = { "/", "login" }, method = RequestMethod.POST)
	public ModelAndView loginDo(@ModelAttribute("form") AdminLoginForm form) {
		logger.debug("Name is  ===== " + form.getUserName(), form.getUserName());
		view.addObject("menuId", 1);
		view.addObject("subMenuId", 100);
		view.setViewName(VIEW_DIR + "index");
		return view;
	}

}
