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

import com.subaozuche.bo.AdminUserBo;
import com.subaozuche.model.AdminUser;

@Controller
@RequestMapping("backend/user")
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
	
	@RequestMapping(value = "create", method = RequestMethod.GET)
	public ModelAndView create() {
		view.addObject("adminuser", new AdminUser());
		view.setViewName(VIEW_DIR + "create");
		return view;
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public ModelAndView createDo(
			@Valid @ModelAttribute("adminuser") AdminUser adminuser,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			view.addObject("adminuser", adminuser);
			view.setViewName(VIEW_DIR + "create");
			return view;
		}
		adminUserBo.add(adminuser);
		return view;
	}

	@RequestMapping(value = "{id}/edit", method = RequestMethod.GET)
	public ModelAndView update(@PathVariable int id) {
		view.addObject("adminuser", adminUserBo.findById(id));
		view.setViewName(VIEW_DIR + "edit");
		return view;
	}

	@RequestMapping(value = "{id}/edit", method = RequestMethod.POST)
	public ModelAndView updateDo(@PathVariable int id,
			@Valid @ModelAttribute("adminuser") AdminUser adminuser,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			view.addObject("adminuser", adminuser);
			view.setViewName(VIEW_DIR + "edit");
			return view;
		}
		AdminUser mAdminuser = adminUserBo.findById(id);
		mAdminuser.setUserName(adminuser.getUserName());
		mAdminuser.setUserPass(adminuser.getUserPass());
		mAdminuser.setUpdatedAt(adminuser.getUpdatedAt());
		adminUserBo.update(mAdminuser);
		return new ModelAndView("redirect:../../");
	}

	@RequestMapping(value = "{id}/delete", method = RequestMethod.GET)
	public String delete(@PathVariable int id) {
		adminUserBo.delete(id);
		return "redirect:../../";
	}
}
