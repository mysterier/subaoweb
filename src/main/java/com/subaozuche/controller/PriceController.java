package com.subaozuche.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("price")
public class PriceController {
	private static final String VIEW_DIR = "frontend/price/";
	private ModelAndView view = new ModelAndView();
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView index() {
		view.setViewName(VIEW_DIR + "index");
		return view;
	}

}
