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
public class HelperController {
	private static final String VIEW_DIR = "frontend/helper/";
	private ModelAndView view = new ModelAndView();

	@RequestMapping(value = "/flow", method = RequestMethod.GET)
	public ModelAndView flowAction() {
		view.addObject("title", ConstTitle.FLOW);
		view.addObject("keywords", ConstKeywords.FLOW);
		view.addObject("description", ConstDescription.FLOW);
		view.setViewName(VIEW_DIR + "flow");
		return view;
	}

	@RequestMapping(value = "/rule", method = RequestMethod.GET)
	public ModelAndView ruleAction() {
		view.addObject("title", ConstTitle.RULE);
		view.addObject("keywords", ConstKeywords.RULE);
		view.addObject("description", ConstDescription.RULE);
		view.setViewName(VIEW_DIR + "rule");
		return view;
	}

	@RequestMapping(value = "/faq", method = RequestMethod.GET)
	public ModelAndView faqAction() {
		view.addObject("title", ConstTitle.FAQ);
		view.addObject("keywords", ConstKeywords.FAQ);
		view.addObject("description", ConstDescription.FAQ);
		view.setViewName(VIEW_DIR + "faq");
		return view;
	}

	@RequestMapping(value = "/member", method = RequestMethod.GET)
	public ModelAndView memberAction() {
		view.addObject("title", ConstTitle.MEMBER);
		view.addObject("keywords", ConstKeywords.MEMBER);
		view.addObject("description", ConstDescription.MEMBER);
		view.setViewName(VIEW_DIR + "member");
		return view;
	}
}
