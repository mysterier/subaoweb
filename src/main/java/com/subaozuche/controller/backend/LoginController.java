package com.subaozuche.controller.backend;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.subaozuche.bo.AdminUserBo;
import com.subaozuche.comm.utils.SessionKeyContent;
import com.subaozuche.controller.core.BaseBackendController;
import com.subaozuche.model.AdminLoginForm;
import com.subaozuche.model.AdminUser;

@Controller
@RequestMapping("backend")
public class LoginController extends BaseBackendController {
	private static final String VIEW_DIR = "backend/";
	private static Logger logger = LoggerFactory.getLogger(LoginController.class);
	private ModelAndView view = new ModelAndView();
	@Autowired
	private AdminUserBo adminUserBo;
	
	public LoginController() {
		super();
	}

	@RequestMapping(value = { "/", "login" }, method = RequestMethod.GET)
	public ModelAndView login(Model model) {
		model.addAttribute("loginForm", new AdminLoginForm());
		view.addObject("menuId", 1);
		view.addObject("subMenuId", 100);
		view.setViewName(VIEW_DIR + "login");
		return view;
	}

	@RequestMapping(value = { "/", "login" }, method = RequestMethod.POST)
	public ModelAndView loginDo(@ModelAttribute("form") AdminLoginForm form) {
		AdminUser adminUser = adminUserBo.findByUserName(form.getUserName());
		if (adminUser != null) {
			if (adminUser.getUserPass().equals(form.getUserPass())) {
				request.getSession().setAttribute(SessionKeyContent.SESSION_KEY_OBJ_USER_BEAN, adminUser.getId());
			} else {
				return new ModelAndView("redirect:./login");
			}
		} else {
			return new ModelAndView("redirect:./login");
		}
		return new ModelAndView("redirect:./adminuser");
	}
}
