package com.subaozuche.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("profile/")
public class ProfileController {
	private static final String VIEW_DIR = "frontend/profile/";
	private ModelAndView view = new ModelAndView();
	
	@RequestMapping(value = "order", method = RequestMethod.GET)
	public ModelAndView orderAction() {
		view.setViewName(VIEW_DIR + "order");
		return view;
	}
	
	@RequestMapping(value = "profile", method = RequestMethod.GET)
	public ModelAndView profileAction() {
		view.setViewName(VIEW_DIR + "profile");
		return view;
	}
	
	@RequestMapping(value = "user", method = RequestMethod.GET)
	public ModelAndView userAction() {
		view.setViewName(VIEW_DIR + "user");
		return view;
	}
}
