package com.subaozuche.controller.backend;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.subaozuche.bo.AdminUserBo;
import com.subaozuche.comm.utils.Encryption;
import com.subaozuche.comm.utils.SessionKeyContent;
import com.subaozuche.controller.core.BaseBackendController;
import com.subaozuche.model.AdminUser;

@Controller
@RequestMapping("backend/adminuser")
public class AdminUserController extends BaseBackendController {
	private static Logger logger = LoggerFactory.getLogger(AdminUserController.class);
	private static final String VIEW_DIR = "backend/user/";
	private ModelAndView view = new ModelAndView();

	@Autowired
	private AdminUserBo adminUserBo;
	
	public AdminUserController() {
		logger.debug("this is AdminUserController Action list=======");
		view.addObject("menuId", 0);
		view.addObject("subMenuId", 0);
	}

	@RequestMapping(value = { "", "list" }, method = RequestMethod.GET)
	public ModelAndView list() {
		logger.debug("SESSION is " + request.getSession().getAttribute(SessionKeyContent.SESSION_KEY_OBJ_USER_BEAN));
		view.addObject("users", adminUserBo.findAll());
		view.setViewName(VIEW_DIR + "list");
		return view;
	}
	
	@RequestMapping(value = "{id}/edit", method = RequestMethod.GET)
	public ModelAndView edit(@PathVariable int id) {
		view.addObject("adminUser", adminUserBo.findById(id));
		view.setViewName(VIEW_DIR + "edit");
		return view;
	}
	
	@RequestMapping(value = "{id}/edit", method = RequestMethod.POST)
	public ModelAndView update(@PathVariable int id, @Valid @ModelAttribute("adminUser") AdminUser admin,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			view.addObject("adminUser", admin);
			view.setViewName(VIEW_DIR + "edit");
			return view;
		}
		AdminUser adminUser = adminUserBo.findById(id);
		adminUser.setUserName(admin.getUserName());
		adminUser.setUserPass(Encryption.md5(admin.getUserPass()));
		adminUserBo.update(adminUser);
		return new ModelAndView("redirect:../");
	}
	
	@RequestMapping(value = "create", method = RequestMethod.GET)
	public ModelAndView create() {
		view.addObject("adminUser", new AdminUser());
		view.setViewName(VIEW_DIR + "create");
		return view;
	}
	
	@RequestMapping(value = "create", method = RequestMethod.POST)
	public ModelAndView createdo(@Valid @ModelAttribute("adminUser") AdminUser admin, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			view.addObject("adminUser", admin);
			view.setViewName(VIEW_DIR + "create");
			return view;
		}
		admin.setUserPass(Encryption.md5(admin.getUserPass()));
		adminUserBo.add(admin);
		return new ModelAndView("redirect:../");
	}
	
	@RequestMapping(value = "{id}/delete", method = RequestMethod.GET)
	public String delete(@PathVariable int id) {
		adminUserBo.delete(id);
		return "redirect:../../";
	}
}
