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

import com.subaozuche.bo.ClientBo;
import com.subaozuche.model.Client;

@Controller
@RequestMapping("backend/client")
public class ClientController {
	private static final String VIEW_DIR = "backend/client/";
	private ModelAndView view = new ModelAndView();

	@Autowired
	private ClientBo clientBo;

	public ClientController() {
		view.addObject("menuId", 1);
		view.addObject("subMenuId", 104);
	}

	@RequestMapping(value = { "", "list" }, method = RequestMethod.GET)
	public ModelAndView list() {
		view.addObject("clients", clientBo.findAll());
		view.setViewName(VIEW_DIR + "list");
		return view;
	}

	@RequestMapping(value = "create", method = RequestMethod.GET)
	public ModelAndView create() {
		view.addObject("client", new Client());
		view.setViewName(VIEW_DIR + "create");
		return view;
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public ModelAndView createDo(
			@Valid @ModelAttribute("client") Client client,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			view.addObject("client", client);
			view.setViewName(VIEW_DIR + "create");
			return view;
		}
		clientBo.add(client);
		return view;
	}

	@RequestMapping(value = "{id}/edit", method = RequestMethod.GET)
	public ModelAndView update(@PathVariable int id) {
		view.addObject("client", clientBo.findById(id));
		view.setViewName(VIEW_DIR + "edit");
		return view;
	}

	@RequestMapping(value = "{id}/edit", method = RequestMethod.POST)
	public ModelAndView updateDo(@PathVariable int id,
			@Valid @ModelAttribute("client") Client client,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			view.addObject("client", client);
			view.setViewName(VIEW_DIR + "edit");
			return view;
		}

		Client mClient = clientBo.findById(id);
		mClient.setMobile(client.getMobile());
		mClient.setClientName(client.getClientName());
		mClient.setClientPass(client.getClientPass());
		mClient.setClientEmail(client.getClientEmail());
		mClient.setCreatedAt(client.getCreatedAt());
		mClient.setUpdatedAt(client.getUpdatedAt());
		clientBo.update(mClient);
		return new ModelAndView("redirect:../../");
	}

	@RequestMapping(value = "{id}/delete", method = RequestMethod.GET)
	public String delete(@PathVariable int id) {
		clientBo.delete(id);
		return "redirect:../../";
	}
}
