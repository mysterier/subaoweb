package com.subaozuche.controller;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.subaozuche.bo.NewsBo;
import com.subaozuche.bo.OrderBo;
import com.subaozuche.comm.utils.ViewObjectInforHelper;
import com.subaozuche.model.Order;

@Controller
@RequestMapping("")
public class HomeController {
	private static final String VIEW_DIR = "frontend/home/";
	private ModelAndView view = new ModelAndView();
	private Map<String, String> options;

	@Autowired
	private OrderBo orderBo;

	@Autowired
	private NewsBo newsBo;

	@RequestMapping(value = { "", "index" }, method = RequestMethod.GET)
	public ModelAndView index() {
		view.setViewName(VIEW_DIR + "index");
		return view;
	}

	@RequestMapping(value = "/order", method = RequestMethod.GET)
	public ModelAndView orderIndex() {
		options = ViewObjectInforHelper.getOrderTypes();
		view.addObject("options", options);
		view.addObject("newses", newsBo.findAll());
		view.addObject("order", new Order());
		view.setViewName(VIEW_DIR + "order");
		return view;
	}

	@RequestMapping(value = "/order", method = RequestMethod.POST)
	public ModelAndView orderPlace(@Valid @ModelAttribute("order") Order order,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			view.addObject("order", order);
			view.setViewName(VIEW_DIR + "order");
			return view;
		}
		orderBo.add(order);
		return new ModelAndView(VIEW_DIR + "index");
	}

	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public ModelAndView regIndex() {
		view.setViewName(VIEW_DIR + "reg");
		return view;
	}
}
