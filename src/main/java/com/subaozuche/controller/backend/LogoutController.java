package com.subaozuche.controller.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.subaozuche.controller.core.BaseBackendController;

@Controller
@RequestMapping("backend/logout")
public class LogoutController extends BaseBackendController {

	@RequestMapping(value = { "" }, method = RequestMethod.GET)
	public String logoutDo() {
		request.getSession().invalidate();
		return "redirect:./login";
	}
}
