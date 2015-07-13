package com.subaozuche.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class ErrorController {
	private static final String VIEW_DIR = "frontend/errors/";
	private ModelAndView view = new ModelAndView();
	
	@RequestMapping(value = "/error/{errorCode}", method = RequestMethod.GET)
	public ModelAndView index(@PathVariable String errorCode) {
		view.setViewName(VIEW_DIR + "error");
		return view;
	}
}
