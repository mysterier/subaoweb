package com.subaozuche.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("")
public class ServiceController {
	private static final String VIEW_DIR = "frontend/service/";
	private ModelAndView view = new ModelAndView();
	
	@RequestMapping(value = "service-jichang", method = RequestMethod.GET)
	public ModelAndView jichang() {
		view.setViewName(VIEW_DIR + "jichang");
		return view;
	}
	
	@RequestMapping(value = "service-banche", method = RequestMethod.GET)
	public ModelAndView banche() {
		view.setViewName(VIEW_DIR + "banche");
		return view;
	}
	
	@RequestMapping(value = "service-huiyi", method = RequestMethod.GET)
	public ModelAndView huiyi() {
		view.setViewName(VIEW_DIR + "huiyi");
		return view;
	}
	
	@RequestMapping(value = "service-shangwu", method = RequestMethod.GET)
	public ModelAndView shangwu() {
		view.setViewName(VIEW_DIR + "shangwu");
		return view;
	}
	
	@RequestMapping(value = "service-lvyou", method = RequestMethod.GET)
	public ModelAndView lvyou() {
		view.setViewName(VIEW_DIR + "lvyou");
		return view;
	}
	
	@RequestMapping(value = "service-linjin", method = RequestMethod.GET)
	public ModelAndView linjin() {
		view.setViewName(VIEW_DIR + "linjin");
		return view;
	}
	
	@RequestMapping(value = "service-hunqing", method = RequestMethod.GET)
	public ModelAndView huiqing() {
		view.setViewName(VIEW_DIR + "hunqing");
		return view;
	}
}
