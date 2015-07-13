package com.subaozuche.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class HelperController {
	private static final String VIEW_DIR = "frontend/helper/";
	private ModelAndView view = new ModelAndView();
	
	@RequestMapping(value = "/flow", method = RequestMethod.GET)
	public ModelAndView flowAction() {
		view.setViewName(VIEW_DIR + "flow");
		return view;
	}
	
	@RequestMapping(value = "/rule", method = RequestMethod.GET)
	public ModelAndView ruleAction() {
		view.setViewName(VIEW_DIR + "rule");
		return view;
	}
	
	@RequestMapping(value = "/faq", method = RequestMethod.GET)
	public ModelAndView faqAction() {
		view.setViewName(VIEW_DIR + "faq");
		return view;
	}
	
	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public ModelAndView memberAction() {
		view.setViewName(VIEW_DIR + "member");
		return view;
	}
}
