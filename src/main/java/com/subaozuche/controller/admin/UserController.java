package com.subaozuche.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.subaozuche.bo.UserBo;

@Controller
@RequestMapping("admin120/user")
public class UserController {
	private static final String VIEW_DIR = "admin/user/";
	private ModelAndView view = new ModelAndView();

	@Autowired
	private UserBo userBo;

	public UserController() {
		view.addObject("menuId", 0);
		view.addObject("subMenuId", 0);
	}

	@RequestMapping(value = { "", "list" }, method = RequestMethod.GET)
	public ModelAndView list() {
		view.addObject("users", userBo.findAll());
		view.setViewName(VIEW_DIR + "list");
		return view;
	}
}
