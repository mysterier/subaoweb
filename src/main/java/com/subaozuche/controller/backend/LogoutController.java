package com.subaozuche.controller.backend;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("backend/logout")
public class LogoutController {

	@RequestMapping(value = {""},method = RequestMethod.GET)
	public String logoutDo() {
		return "redirect:../";
	}
}
