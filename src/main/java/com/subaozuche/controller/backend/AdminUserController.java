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
	
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	public ModelAndView edit(@PathVariable int id) {
		view.addObject("model", adminUserBo.findById(id));
		view.setViewName(VIEW_DIR + "edit");
		return view;
	}
	
	@RequestMapping(value = "{id}", method = RequestMethod.POST)
	public ModelAndView update(@PathVariable int id, @Valid @ModelAttribute("adminUser") AdminUser admin,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			view.addObject("model", admin);
			view.setViewName(VIEW_DIR + "edit");
			return view;
		}
		
		AdminUser model = adminUserBo.findById(id);
		model.setUserName(admin.getUserName());
		model.setUserPass(admin.getUserPass());
		adminUserBo.update(model);
		return new ModelAndView("redirect:./");
	}
	
	@RequestMapping(value = "create", method = RequestMethod.GET)
	public ModelAndView create() {
		view.addObject("model", new AdminUser());
		view.setViewName(VIEW_DIR + "create");
		return view;
	}
	
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public ModelAndView createdo(@Valid @ModelAttribute("adminUser") AdminUser admin, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			view.addObject("model", admin);
			view.setViewName(VIEW_DIR + "edit");
			return view;
		}
		
		adminUserBo.add(admin);
		return new ModelAndView("redirect:../");
	}
	
	@RequestMapping(value = "del/{id}", method = RequestMethod.GET)
	public String delete(@PathVariable int id) {
		adminUserBo.delete(id);
		return "redirect:../list";
	}
}
