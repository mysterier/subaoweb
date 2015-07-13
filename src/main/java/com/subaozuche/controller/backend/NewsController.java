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

import com.subaozuche.bo.NewsBo;
import com.subaozuche.model.News;

@Controller
@RequestMapping("backend/news")
public class NewsController {
	private static final String VIEW_DIR = "backend/news/";
	private ModelAndView view = new ModelAndView();

	@Autowired
	private NewsBo newsBo;

	public NewsController() {
		view.addObject("menuId", 1);
		view.addObject("subMenuId", 103);
	}

	@RequestMapping(value = { "", "list" }, method = RequestMethod.GET)
	public ModelAndView list() {
		view.addObject("newses", newsBo.findAll());
		view.setViewName(VIEW_DIR + "list");
		return view;
	}

	@RequestMapping(value = "create", method = RequestMethod.GET)
	public ModelAndView create() {
		view.addObject("news", new News());
		view.setViewName(VIEW_DIR + "create");
		return view;
	}

	@RequestMapping(value = "create", method = RequestMethod.POST)
	public ModelAndView createDo(@Valid @ModelAttribute("news") News news,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			view.addObject("news", news);
			view.setViewName(VIEW_DIR + "create");
			return view;
		}
		newsBo.add(news);
		return view;
	}

	@RequestMapping(value = "{id}/edit", method = RequestMethod.GET)
	public ModelAndView update(@PathVariable int id) {
		view.addObject("news", newsBo.findById(id));
		view.setViewName(VIEW_DIR + "edit");
		return view;
	}

	@RequestMapping(value = "{id}/edit", method = RequestMethod.POST)
	public ModelAndView updateDo(@PathVariable int id,
			@Valid @ModelAttribute("news") News news,
			BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			view.addObject("news", news);
			view.setViewName(VIEW_DIR + "edit");
			return view;
		}

		News mNews = newsBo.findById(id);
		mNews.setTitle(news.getTitle());
		mNews.setContent(news.getContent());
		newsBo.update(mNews);
		return new ModelAndView("redirect:../../");
	}

	@RequestMapping(value = "{id}/delete", method = RequestMethod.GET)
	public String delete(@PathVariable int id) {
		newsBo.delete(id);
		return "redirect:../../";
	}

}
