package com.subaozuche.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.subaozuche.comm.utils.ConstDescription;
import com.subaozuche.comm.utils.ConstKeywords;
import com.subaozuche.comm.utils.ConstTitle;

@Controller
@RequestMapping("price")
public class PriceController {
	private static final String VIEW_DIR = "frontend/price/";
	private ModelAndView view = new ModelAndView();
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView index() {
		view.addObject("title", ConstTitle.PRICE);
		view.addObject("keywords", ConstKeywords.PRICE);
		view.addObject("description", ConstDescription.PRICE);
		view.setViewName(VIEW_DIR + "index");
		return view;
	}
}
