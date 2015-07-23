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
import com.subaozuche.comm.utils.ConstDescription;
import com.subaozuche.comm.utils.ConstKeywords;
import com.subaozuche.comm.utils.ConstTitle;
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
		view.addObject("title", ConstTitle.ACTIVITIES);
		view.addObject("keywords", ConstKeywords.ACTIVITIES);
		view.addObject("description", ConstDescription.ACTIVITIES);
		view.addObject("activities", activityBo.findAll());
		view.setViewName(VIEW_DIR + "activities");
		return view;
	}

	@RequestMapping(value = "/activities/{id}.html", method = RequestMethod.GET)
	public ModelAndView activitieDetailAction(@PathVariable int id) {
		view.addObject("title", activityBo.findById(id).getTitle());
		view.addObject("keywords", ConstKeywords.ACTIVITIES);
		view.addObject("description", ConstDescription.ACTIVITIES);
		view.addObject("activity", activityBo.findById(id));
		view.setViewName(VIEW_DIR + "activitie_detail");
		return view;
	}

	@RequestMapping(value = "/about", method = RequestMethod.GET)
	public ModelAndView aboutAction() {
		view.addObject("title", ConstTitle.ABOUT);
		view.addObject("keywords", ConstKeywords.ABOUT);
		view.addObject("description", ConstDescription.ABOUT);
		view.setViewName(VIEW_DIR + "about");
		return view;
	}

	@RequestMapping(value = "/contact", method = RequestMethod.GET)
	public ModelAndView contactAction() {
		view.addObject("title", ConstTitle.CONTACT);
		view.addObject("keywords", ConstKeywords.CONTACT);
		view.addObject("description", ConstDescription.CONTACT);
		view.setViewName(VIEW_DIR + "contact");
		return view;
	}

	@RequestMapping(value = "/joinus", method = RequestMethod.GET)
	public ModelAndView joinusAction() {
		view.addObject("title", ConstTitle.JOINUS);
		view.addObject("keywords", ConstKeywords.JOINUS);
		view.addObject("description", ConstDescription.JOINUS);
		view.addObject("recruitInfors", getCurrentList(recruitBo.findAll(), 1));
		view.addObject("totalPage", totalPage);
		view.setViewName(VIEW_DIR + "joinus");
		return view;
	}

	@RequestMapping(value = "/joinus/{title}", method = RequestMethod.GET)
	public ModelAndView joinusDetailAction(@PathVariable String title) {
		view.addObject("title", title);
		view.addObject("keywords", ConstKeywords.JOINUS);
		view.addObject("description", ConstDescription.JOINUS);
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
