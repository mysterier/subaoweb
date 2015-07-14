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

import com.subaozuche.bo.CityBo;
import com.subaozuche.model.City;

@Controller
@RequestMapping("backend/city")
public class CityController {
	private static final String VIEW_DIR = "backend/city/";
	private ModelAndView view = new ModelAndView();

	@Autowired
	private CityBo cityBo;

	public CityController() {
		view.addObject("menuId", 0);
		view.addObject("subMenuId", 101);
	}

	@RequestMapping(value = { "", "list" }, method = RequestMethod.GET)
	public ModelAndView list() {
		view.addObject("cities", cityBo.findAll());
		view.setViewName(VIEW_DIR + "list");
		return view;
	}

	@RequestMapping(value = "create", method = RequestMethod.GET)
	public ModelAndView create() {
		view.addObject("city", new City());
		view.setViewName(VIEW_DIR + "create");
		return view;
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public ModelAndView createDo(@Valid @ModelAttribute("city") City city,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			view.addObject("city", city);
			view.setViewName(VIEW_DIR + "create");
			return view;
		}
		cityBo.add(city);
		return new ModelAndView("redirect:../");
	}

	@RequestMapping(value = "{id}/edit", method = RequestMethod.GET)
	public ModelAndView update(@PathVariable int id) {
		view.addObject("city", cityBo.findById(id));
		view.setViewName(VIEW_DIR + "edit");
		return view;
	}

	@RequestMapping(value = "{id}/edit", method = RequestMethod.POST)
	public ModelAndView updateDo(@PathVariable int id,
			@Valid @ModelAttribute("city") City city,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			view.addObject("city", city);
			view.setViewName(VIEW_DIR + "edit");
			return view;
		}

		City mCity = cityBo.findById(id);
		mCity.setCityName(city.getCityName());
		cityBo.update(mCity);
		return new ModelAndView("redirect:../../");
	}

	@RequestMapping(value = "{id}/delete", method = RequestMethod.GET)
	public String delete(@PathVariable int id) {
		cityBo.delete(id);
		return "redirect:../";
	}
}
