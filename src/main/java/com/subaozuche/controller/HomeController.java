package com.subaozuche.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class HomeController {
	private static final String VIEW_DIR = "frontend/home/";
	private ModelAndView view = new ModelAndView();
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView index() {
		view.setViewName(VIEW_DIR + "index");
		return view;
	}
	
	@RequestMapping(value = "/order", method = RequestMethod.GET)
	public ModelAndView orderIndex() {
		view.setViewName(VIEW_DIR + "order");
		return view;
	}
	
	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public ModelAndView regIndex() {
		view.setViewName(VIEW_DIR + "reg");
		return view;
	}
}
