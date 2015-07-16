package com.subaozuche.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.subaozuche.bo.ClientBo;
import com.subaozuche.comm.utils.Encryption;
import com.subaozuche.comm.utils.SessionKeyContent;
import com.subaozuche.model.Client;
import com.subaozuche.model.ClientLoginForm;

@Controller
@RequestMapping("")
public class HomeController {
	private static final String VIEW_DIR = "frontend/home/";
	private ModelAndView view = new ModelAndView();
	@Autowired
	protected HttpServletRequest request;
	@Autowired
	private ClientBo clientBo;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public ModelAndView index() {
		view.setViewName(VIEW_DIR + "index");
		return view;
	}
	
	@RequestMapping(value = "/order", method = RequestMethod.GET)
	public ModelAndView orderIndex() {
		view.setViewName(VIEW_DIR + "order");
		return view;
	}
	
	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public ModelAndView regIndex() {
		view.setViewName(VIEW_DIR + "reg");
		return view;
	}
	
	@RequestMapping(value = "/logo_res", method = RequestMethod.GET)
	public ModelAndView logoRes() {
		view.setViewName(VIEW_DIR + "logo_res");
		return view;
	}
	
	@RequestMapping(value = { "/", "login" }, method = RequestMethod.POST)
	public ModelAndView loginDo(@ModelAttribute("form") ClientLoginForm form) {
		Client client = clientBo.findByClientName(form.getClientName());
		if (client != null) {
			if (client.getClientPass().equals(Encryption.md5(form.getClientPass()))) {
				request.getSession().setAttribute(SessionKeyContent.SESSION_KEY_OBJ_CLIENT_BEAN, client.getId());
				return new ModelAndView("redirect:/");
			} else {
				return new ModelAndView("redirect:/logo_res");
			}
		} else {
			return new ModelAndView("redirect:/logo_res");
		}
	}
}
