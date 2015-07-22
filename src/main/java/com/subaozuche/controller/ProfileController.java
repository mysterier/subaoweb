package com.subaozuche.controller;

import java.sql.Timestamp;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.subaozuche.bo.ClientBo;
import com.subaozuche.bo.OrderBo;
import com.subaozuche.comm.utils.ConstDescription;
import com.subaozuche.comm.utils.ConstKeywords;
import com.subaozuche.comm.utils.ConstTitle;
import com.subaozuche.comm.utils.Encryption;
import com.subaozuche.comm.utils.SessionKeyContent;
import com.subaozuche.model.Client;

@Controller
@RequestMapping("profile/")
public class ProfileController {
	private static final String VIEW_DIR = "frontend/profile/";
	private ModelAndView view = new ModelAndView();
	@Autowired
	private HttpServletRequest request;
	@Autowired
	private ClientBo clientBo;
	@Autowired
	private OrderBo orderBo;
	
	public ProfileController() {
		view.addObject("title", ConstTitle.PROFILE);
		view.addObject("keywords", ConstKeywords.PROFILE);
		view.addObject("description", ConstDescription.PROFILE);
	}
	
	private int getUid() {
		int uid = (int) request.getSession().getAttribute(SessionKeyContent.SESSION_KEY_OBJ_CLIENT_BEAN);
		return uid;
	}
	
	@RequestMapping(value = "order", method = RequestMethod.GET)
	public ModelAndView orderAction() {
		view.addObject("menu", "order");
		view.addObject("orders", orderBo.findByClientId(getUid()));
		view.addObject("msg", "");
		view.setViewName(VIEW_DIR + "order");
		return view;
	}
	
	@RequestMapping(value = "passwd", method = RequestMethod.GET)
	public ModelAndView passwdAction() {	
		view.addObject("menu", "passwd");
		view.addObject("client", new Client());
		view.addObject("msg", "");
		view.setViewName(VIEW_DIR + "passwd");
		return view;
	}
	
	@RequestMapping(value = "passwd", method = RequestMethod.POST)
	public ModelAndView passwdDo(@Valid @ModelAttribute("client") Client client,
			BindingResult bindingResult) {
		view.addObject("menu", "passwd");
		if (bindingResult.hasFieldErrors("clientPass")) {
			view.addObject("client", client);
			view.setViewName(VIEW_DIR + "passwd");
			return view;
		}
		
		Client user = clientBo.findById(getUid());
		user.setClientPass(Encryption.md5(client.getClientPass()));
		user.setUpdatedAt(new Timestamp(new Date().getTime()));
		clientBo.update(user);
		view.addObject("msg", "密码修改成功！！");
		view.setViewName(VIEW_DIR + "passwd");
		return view;
	}
	
	@RequestMapping(value = "user", method = RequestMethod.GET)
	public ModelAndView userAction() {
		view.addObject("menu", "user");
		view.addObject("client", clientBo.findById(getUid()));
		view.addObject("msg", "");
		view.setViewName(VIEW_DIR + "user");
		return view;
	}
	
	@RequestMapping(value = "user", method = RequestMethod.POST)
	public ModelAndView userDo(@Valid @ModelAttribute("client") Client client,
			BindingResult bindingResult) {
		view.addObject("menu", "user");
		view.addObject("client", client);
		if (!bindingResult.hasFieldErrors("clientEmail") && !bindingResult.hasFieldErrors("mobile")) {
			Client user = clientBo.findById(getUid());
			user.setClientEmail(client.getClientEmail());
			user.setMobile(client.getMobile());
			user.setUpdatedAt(new Timestamp(new Date().getTime()));
			clientBo.update(user);
			view.addObject("msg", "资料修改成功！！");
		}				
		view.setViewName(VIEW_DIR + "user");
		return view;
	}
}
