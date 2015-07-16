package com.subaozuche.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.subaozuche.bo.ActivityBo;
import com.subaozuche.bo.RecruitBo;

@Controller
@RequestMapping("")
public class InforController {
	private static final String VIEW_DIR = "frontend/infor/";
	private ModelAndView view = new ModelAndView();

	@Autowired
	private RecruitBo recruitBo;
	@Autowired
	private ActivityBo activityBo;

	@RequestMapping(value = "/activities", method = RequestMethod.GET)
	public ModelAndView activitiesAction() {
		view.addObject("activities", activityBo.findAll());
		view.setViewName(VIEW_DIR + "activities");
		return view;
	}

	@RequestMapping(value = "/activities/detail/{id}", method = RequestMethod.GET)
	public ModelAndView activitieDetailAction(@PathVariable int id) {
		view.addObject("activity", activityBo.findById(id));
		view.setViewName(VIEW_DIR + "activitie_detail");
		return view;
	}

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public ModelAndView aboutAction() {
		view.setViewName(VIEW_DIR + "about");
		return view;
	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public ModelAndView contactAction() {
		view.setViewName(VIEW_DIR + "contact");
		return view;
	}

	@RequestMapping(value = "/joinus", method = RequestMethod.GET)
	public ModelAndView joinusAction() {
		view.addObject("recruitInfors", recruitBo.findAll());
		view.setViewName(VIEW_DIR + "joinus");
		return view;
	}

	@RequestMapping(value = "/joinus/{title}", method = RequestMethod.GET)
	public ModelAndView joinusDetailAction(@PathVariable String title) {
		view.addObject("recruitInfor", recruitBo.findByTitle(title));
		view.setViewName(VIEW_DIR + "joinus_detail");
		return view;
	}
}
