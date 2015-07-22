package com.subaozuche.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.subaozuche.bo.ActivityBo;
import com.subaozuche.bo.RecruitBo;
import com.subaozuche.model.Recruit;

@Controller
@RequestMapping("")
public class InforController {
	private static final String VIEW_DIR = "frontend/infor/";
	private ModelAndView view = new ModelAndView();
	private static int DEFAULT_PAGE_SIZE = 10;
	private int itemPerPage = DEFAULT_PAGE_SIZE;
	private int totalPage;
	private List<Recruit> curRecruitList = new ArrayList<Recruit>();
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
		view.addObject("recruitInfors", getCurrentList(recruitBo.findAll(), 1));
		view.addObject("totalPage", totalPage);
		view.setViewName(VIEW_DIR + "joinus");
		return view;
	}

	@RequestMapping(value = "/company/joinus/{id}")
	public ModelAndView recruitPagination(@PathVariable int id) {
		view.addObject("recruitInfors", getCurrentList(recruitBo.findAll(), id));
		view.addObject("totalPage", totalPage);
		view.setViewName(VIEW_DIR + "joinus");
		return view;
	}

	@RequestMapping(value = "/joinus/{title}", method = RequestMethod.GET)
	public ModelAndView joinusDetailAction(@PathVariable String title) {
		view.addObject("recruitInfor", recruitBo.findByTitle(title));
		view.setViewName(VIEW_DIR + "joinus_detail");
		return view;
	}

	private List<Recruit> getCurrentList(List<Recruit> recruitList, int id) {
		totalPage = recruitList.size() / itemPerPage + 1;
		int totalNews = recruitList.size();
		curRecruitList.clear();
		int startId = (id - 1) * itemPerPage;
		int endId = startId + itemPerPage;
		for (int i = startId; i < totalNews && i < endId; i++) {
			curRecruitList.add(recruitList.get(i));
		}
		return curRecruitList;
	}
}
