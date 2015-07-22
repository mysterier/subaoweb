package com.subaozuche.controller;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.subaozuche.bo.ClientBo;
import com.subaozuche.comm.utils.Encryption;
import com.subaozuche.comm.utils.SessionKeyContent;
import com.subaozuche.model.Client;
import com.subaozuche.model.ClientLoginForm;
import com.subaozuche.model.News;
import com.subaozuche.bo.NewsBo;
import com.subaozuche.bo.OrderBo;
import com.subaozuche.comm.utils.ViewObjectInforHelper;
import com.subaozuche.model.Order;

@Controller
@RequestMapping("")
public class HomeController {
	private static final String VIEW_DIR = "frontend/home/";
	private ModelAndView view = new ModelAndView();
	private Map<String, String> options = ViewObjectInforHelper.getOrderTypes();
	private static int DEFAULT_PAGE_SIZE = 10;
	private int itemPerPage = DEFAULT_PAGE_SIZE;
	private List<News> curNewsList = new ArrayList<News>();

	@Autowired
	protected HttpServletRequest request;

	@Autowired
	private ClientBo clientBo;

	@Autowired
	private OrderBo orderBo;

	@Autowired
	private NewsBo newsBo;

	@RequestMapping(value = { "", "index" }, method = RequestMethod.GET)
	public ModelAndView index() {
		view.addObject("subMenuId", 0);
		view.setViewName(VIEW_DIR + "index");
		return view;
	}

	@RequestMapping(value = "/order", method = RequestMethod.GET)
	public ModelAndView orderIndex() {
		view.addObject("options", options);
		view.addObject("newses", getCurrentList(newsBo.findAll(), 1));
		view.addObject("order", new Order());
		view.setViewName(VIEW_DIR + "order");
		return view;
	}

	@RequestMapping(value = "/order", method = RequestMethod.POST)
	public ModelAndView orderPlace(@Valid @ModelAttribute("order") Order order,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			view.addObject("order", order);
			view.setViewName(VIEW_DIR + "order");
			return view;
		}
		orderBo.add(order);
		return new ModelAndView(VIEW_DIR + "index");
	}

	@RequestMapping(value = "/reg", method = RequestMethod.GET)
	public ModelAndView regIndex() {
		view.addObject("options", options);
		view.addObject("newses", getCurrentList(newsBo.findAll(), 1));
		view.addObject("client", new Client());
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
			if (client.getClientPass().equals(
					Encryption.md5(form.getClientPass()))) {
				request.getSession().setAttribute(
						SessionKeyContent.SESSION_KEY_OBJ_CLIENT_BEAN,
						client.getId());
				return new ModelAndView("redirect:/");
			} else {
				return new ModelAndView("redirect:/logo_res");
			}
		} else {
			return new ModelAndView("redirect:/logo_res");
		}
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logoutDo() {
		request.getSession().invalidate();
		return "redirect:/";
	}

	@RequestMapping(value = "/reg", method = RequestMethod.POST)
	public ModelAndView regDo(@Valid @ModelAttribute("client") Client client,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			view.addObject("client", client);
			view.addObject("options", options);
			view.addObject("newses", newsBo.findAll());
			view.setViewName(VIEW_DIR + "reg");
			return view;
		}
		client.setClientPass(Encryption.md5(client.getClientPass()));
		client.setUpdatedAt(new Timestamp(new Date().getTime()));
		clientBo.add(client);
		return new ModelAndView("redirect:/");
	}

	private List<News> getCurrentList(List<News> newsList, int id) {
		int totalNews = newsList.size();
		curNewsList.clear();
		int startId = (id - 1) * itemPerPage;
		int endId = startId + itemPerPage;
		for (int i = startId; i < totalNews && i < endId; i++) {
			curNewsList.add(newsList.get(i));
		}
		return curNewsList;
	}
}
