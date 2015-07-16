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

import com.subaozuche.bo.RecruitBo;
import com.subaozuche.model.Recruit;

@Controller
@RequestMapping("backend/recruit")
public class RecruitController {
	private static final String VIEW_DIR = "backend/recruit/";
	private ModelAndView view = new ModelAndView();

	@Autowired
	private RecruitBo recruitBo;

	public RecruitController() {
		view.addObject("menuId", 1);
		view.addObject("subMenuId", 105);
	}

	@RequestMapping(value = { "", "list" }, method = RequestMethod.GET)
	public ModelAndView list() {
		view.addObject("recruits", recruitBo.findAll());
		view.setViewName(VIEW_DIR + "list");
		return view;
	}

	@RequestMapping(value = "create", method = RequestMethod.GET)
	public ModelAndView create() {
		view.addObject("recruit", new Recruit());
		view.setViewName(VIEW_DIR + "create");
		return view;
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public ModelAndView createDo(
			@Valid @ModelAttribute("recruit") Recruit recruit,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			view.addObject("recruit", recruit);
			view.setViewName(VIEW_DIR + "create");
			return view;
		}
		recruitBo.add(recruit);
		return new ModelAndView("redirect:../");
	}

	@RequestMapping(value = "{id}/edit", method = RequestMethod.GET)
	public ModelAndView update(@PathVariable int id) {
		view.addObject("recruit", recruitBo.findById(id));
		view.setViewName(VIEW_DIR + "edit");
		return view;
	}

	@RequestMapping(value = "{id}/edit", method = RequestMethod.POST)
	public ModelAndView updateDo(@PathVariable int id,
			@Valid @ModelAttribute("recruit") Recruit recruit,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			view.addObject("recruit", recruit);
			view.setViewName(VIEW_DIR + "edit");
			return view;
		}

		Recruit mRecruit = recruitBo.findById(id);
		mRecruit.setTitle(recruit.getTitle());
		mRecruit.setContent(recruit.getContent());
		recruitBo.update(mRecruit);
		return new ModelAndView("redirect:../../");
	}

	@RequestMapping(value = "{id}/delete", method = RequestMethod.GET)
	public String delete(@PathVariable int id) {
		recruitBo.delete(id);
		return "redirect:../../";
	}

}
