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
	
	@RequestMapping(value = "/news", method = RequestMethod.GET)
	public ModelAndView newsAction() {
		view.setViewName(VIEW_DIR + "news");
		return view;
	}
	
	@RequestMapping(value = "/news/{title}", method = RequestMethod.GET)
	public ModelAndView newsDetailAction(@PathVariable String title) {
		view.setViewName(VIEW_DIR + "news_detail");
		view.addObject(title);
		return view;
	}
	
	@RequestMapping(value = "/industry", method = RequestMethod.GET)
	public ModelAndView industryAction() {
		view.setViewName(VIEW_DIR + "industry");
		return view;
	}
	
	@RequestMapping(value = "/industry/{title}", method = RequestMethod.GET)
	public ModelAndView industryDetailAction(@PathVariable String title) {
		view.addObject(title);
		view.setViewName(VIEW_DIR + "industry_detail");
		return view;
	}
	
	@RequestMapping(value = "/company", method = RequestMethod.GET)
	public ModelAndView companyAction() {
		view.setViewName(VIEW_DIR + "company");
		return view;
	}
	
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
