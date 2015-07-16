package com.subaozuche.controller.backend;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.subaozuche.bo.ActivityBo;
import com.subaozuche.model.Activity;

@Controller
@RequestMapping("backend/activity")
public class ActivityController {
	private static final String VIEW_DIR = "backend/activity/";
	private ModelAndView view = new ModelAndView();

	@Autowired
	private ActivityBo activityBo;

	public ActivityController() {
		view.addObject("menuId", 0);
		view.addObject("subMenuId", 106);
	}

	@RequestMapping(value = { "", "list" }, method = RequestMethod.GET)
	public ModelAndView list() {
		view.addObject("activities", activityBo.findAll());
		view.setViewName(VIEW_DIR + "list");
		return view;
	}

	@RequestMapping(value = "create", method = RequestMethod.GET)
	public ModelAndView create() {
		view.addObject("activity", new Activity());
		view.setViewName(VIEW_DIR + "create");
		return view;
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public ModelAndView createDo(
			@Valid @ModelAttribute("activity") Activity activity,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			view.addObject("activity", activity);
			view.setViewName(VIEW_DIR + "create");
			return view;
		}
		activityBo.add(activity);
		return new ModelAndView("redirect:../");
	}

	@RequestMapping(value = "{id}/edit", method = RequestMethod.GET)
	public ModelAndView update(@PathVariable int id) {
		view.addObject("activity", activityBo.findById(id));
		view.setViewName(VIEW_DIR + "edit");
		return view;
	}

	@RequestMapping(value = "{id}/edit", method = RequestMethod.POST)
	public ModelAndView updateDo(@PathVariable int id,
			@Valid @ModelAttribute("activity") Activity activity,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			view.addObject("activity", activity);
			view.setViewName(VIEW_DIR + "edit");
			return view;
		}

		Activity mActivity = activityBo.findById(id);
		mActivity.setTitle(activity.getTitle());
		mActivity.setCity(activity.getCity());
		mActivity.setContent(activity.getContent());
		mActivity.setActivityIntro(activity.getActivityIntro());
		mActivity.setActivityStart(activity.getActivityStart());
		mActivity.setActivityEnd(activity.getActivityEnd());
		activityBo.update(mActivity);
		return new ModelAndView("redirect:../../");
	}

	@RequestMapping(value = "{id}/delete", method = RequestMethod.GET)
	public String delete(@PathVariable int id) {
		activityBo.delete(id);
		return "redirect:../";
	}
}
