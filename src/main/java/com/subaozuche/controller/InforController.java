package com.subaozuche.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class InforController {
	private static final String VIEW_DIR = "frontend/infor/";
	private ModelAndView view = new ModelAndView();
	
	@RequestMapping(value = "/activities", method = RequestMethod.GET)
	public ModelAndView activitiesAction() {
		view.setViewName(VIEW_DIR + "activities");
		return view;
	}
	
	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public ModelAndView aboutAction() {
		view.setViewName(VIEW_DIR + "about");
		return view;
	}
	
	@RequestMapping(value = "/joinus", method = RequestMethod.GET)
	public ModelAndView joinusAction() {
		view.setViewName(VIEW_DIR + "joinus");
		return view;
	}
	
	@RequestMapping(value = "/joinus/{title}", method = RequestMethod.GET)
	public ModelAndView joinusDetailAction(@PathVariable String title) {
		view.addObject(title);
		view.setViewName(VIEW_DIR + "joinus_detail");
		return view;
	}
}
