package com.subaozuche.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.subaozuche.comm.utils.ConstDescription;
import com.subaozuche.comm.utils.ConstKeywords;
import com.subaozuche.comm.utils.ConstTitle;

@Controller
@RequestMapping("")
public class ServiceController {
	private static final String VIEW_DIR = "frontend/service/";
	private ModelAndView view = new ModelAndView();
	
	@RequestMapping(value = "service-jichang", method = RequestMethod.GET)
	public ModelAndView jichang() {
		view.addObject("title", ConstTitle.SERVICEJICHANG);
		view.addObject("keywords", ConstKeywords.SERVICEJICHANG);
		view.addObject("description", ConstDescription.SERVICEJICHANG);
		view.setViewName(VIEW_DIR + "jichang");
		return view;
	}
	
	@RequestMapping(value = "service-banche", method = RequestMethod.GET)
	public ModelAndView banche() {
		view.addObject("title", ConstTitle.SERVICEBANCHE);
		view.addObject("keywords", ConstKeywords.SERVICEBANCHE);
		view.addObject("description", ConstDescription.SERVICEBANCHE);
		view.setViewName(VIEW_DIR + "banche");
		return view;
	}
	
	@RequestMapping(value = "service-huiyi", method = RequestMethod.GET)
	public ModelAndView huiyi() {
		view.addObject("title", ConstTitle.SERVICEHUIYI);
		view.addObject("keywords", ConstKeywords.SERVICEHUIYI);
		view.addObject("description", ConstDescription.SERVICEHUIYI);
		view.setViewName(VIEW_DIR + "huiyi");
		return view;
	}
	
	@RequestMapping(value = "service-shangwu", method = RequestMethod.GET)
	public ModelAndView shangwu() {
		view.addObject("title", ConstTitle.SERVICESHANGWU);
		view.addObject("keywords", ConstKeywords.SERVICESHANGWU);
		view.addObject("description", ConstDescription.SERVICESHANGWU);
		view.setViewName(VIEW_DIR + "shangwu");
		return view;
	}
	
	@RequestMapping(value = "service-lvyou", method = RequestMethod.GET)
	public ModelAndView lvyou() {
		view.addObject("title", ConstTitle.SERVICELVYOU);
		view.addObject("keywords", ConstKeywords.SERVICELVYOU);
		view.addObject("description", ConstDescription.SERVICELVYOU);
		view.setViewName(VIEW_DIR + "lvyou");
		return view;
	}
	
	@RequestMapping(value = "service-linjin", method = RequestMethod.GET)
	public ModelAndView linjin() {
		view.addObject("title", ConstTitle.SERVICELINJIN);
		view.addObject("keywords", ConstKeywords.SERVICELINJIN);
		view.addObject("description", ConstDescription.SERVICELINJIN);
		view.setViewName(VIEW_DIR + "linjin");
		return view;
	}
	
	@RequestMapping(value = "service-hunqing", method = RequestMethod.GET)
	public ModelAndView huiqing() {
		view.addObject("title", ConstTitle.SERVICEHUNQING);
		view.addObject("keywords", ConstKeywords.SERVICEHUNQING);
		view.addObject("description", ConstDescription.SERVICEHUNQING);
		view.setViewName(VIEW_DIR + "hunqing");
		return view;
	}
}
