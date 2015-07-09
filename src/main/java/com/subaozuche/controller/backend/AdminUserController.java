package com.subaozuche.controller.backend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.subaozuche.bo.AdminUserBo;

@Controller
@RequestMapping("backend/adminuser")
public class AdminUserController {
	private static final String VIEW_DIR = "backend/user/";
	private ModelAndView view = new ModelAndView();

	@Autowired
	private AdminUserBo adminUserBo;

	public AdminUserController() {
		view.addObject("menuId", 0);
		view.addObject("subMenuId", 0);
	}

	@RequestMapping(value = { "", "list" }, method = RequestMethod.GET)
	public ModelAndView list() {
		view.addObject("users", adminUserBo.findAll());
		view.setViewName(VIEW_DIR + "list");
		return view;
	}
}
