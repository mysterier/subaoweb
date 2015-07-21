package com.subaozuche.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.subaozuche.bo.NewsBo;

@Controller
@RequestMapping("")
public class NewsCenterController {
	private static final String VIEW_DIR = "frontend/news/";
	private ModelAndView view = new ModelAndView();

	@Autowired
	private NewsBo newsBo;
	
	@RequestMapping(value = "news", method = RequestMethod.GET)
	public ModelAndView newsCenter() {
		view.addObject("industryNewses", newsBo.findByType(0));
		view.addObject("companyNewses", newsBo.findByType(1));
		view.setViewName(VIEW_DIR + "center");
		return view;
	}
	
	@RequestMapping(value = "industry", method = RequestMethod.GET)
	public ModelAndView newsIndustry() {
		view.addObject("industryNewses", newsBo.findByType(0));
		view.setViewName(VIEW_DIR + "industry");
		return view;
	}
	
	@RequestMapping(value = "/industry/{id}.html", method = RequestMethod.GET)
	public ModelAndView industryDetailAction(@PathVariable int id) {
		view.addObject("industryNews", newsBo.findById(id));
		view.setViewName(VIEW_DIR + "industry_detail");
		return view;
	}
	
	@RequestMapping(value = "company", method = RequestMethod.GET)
	public ModelAndView newsCompany() {
		view.addObject("companyNewses", newsBo.findByType(1));
		view.setViewName(VIEW_DIR + "company");
		return view;
	}
	
	@RequestMapping(value = "/company/{id}.html", method = RequestMethod.GET)
	public ModelAndView companyDetailAction(@PathVariable int id) {
		view.addObject("companyNews", newsBo.findById(id));
		view.setViewName(VIEW_DIR + "company_detail");
		return view;
	}
}
