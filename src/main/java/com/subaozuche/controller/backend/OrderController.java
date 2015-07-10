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

import com.subaozuche.bo.OrderBo;
import com.subaozuche.model.Order;

@Controller
@RequestMapping("backend/order")
public class OrderController {
	private static final String VIEW_DIR = "backend/order/";
	private ModelAndView view = new ModelAndView();
	
	@Autowired
	private OrderBo orderBo;
	
	public OrderController() {
		view.addObject("menuId", 0);
		view.addObject("subMenuId", 102);
	}

	@RequestMapping(value = { "", "list" }, method = RequestMethod.GET)
	public ModelAndView list() {
		view.addObject("orders", orderBo.findAll());
		view.setViewName(VIEW_DIR + "list");
		return view;
	}

	@RequestMapping(value = "create", method = RequestMethod.GET)
	public ModelAndView create() {
		view.addObject("order", new Order());
		view.setViewName(VIEW_DIR + "create");
		return view;
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public ModelAndView createDo(@Valid @ModelAttribute("order") Order order,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			view.addObject("order", order);
			view.setViewName(VIEW_DIR + "create");
			return view;
		}
		orderBo.add(order);
		return view;
	}

	@RequestMapping(value = "{id}/edit", method = RequestMethod.GET)
	public ModelAndView update(@PathVariable int id) {
		view.addObject("order", orderBo.findById(id));
		view.setViewName(VIEW_DIR + "edit");
		return view;
	}

	@RequestMapping(value = "{id}/edit", method = RequestMethod.POST)
	public ModelAndView updateDo(@PathVariable int id,
			@Valid @ModelAttribute("order") Order order,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			view.addObject("order", order);
			view.setViewName(VIEW_DIR + "edit");
			return view;
		}

		Order mOrder = orderBo.findById(id);
		mOrder.setCityId(order.getCityId());
		mOrder.setRentTime(order.getRentTime());
		mOrder.setContactName(order.getContactName());
		mOrder.setContactPhone(order.getContactPhone());
		mOrder.setRentType(order.getRentType());
		mOrder.setRentOther(order.getRentOther());
		mOrder.setClientId(order.getClientId());
		mOrder.setcreatedAt(order.getcreatedAt());
		orderBo.update(mOrder);
		return new ModelAndView("redirect:../../");
	}

	@RequestMapping(value = "{id}/delete", method = RequestMethod.GET)
	public String delete(@PathVariable int id) {
		orderBo.delete(id);
		return "redirect:../../";
	}
}
