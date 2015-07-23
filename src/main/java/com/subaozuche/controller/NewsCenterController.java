package com.subaozuche.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.subaozuche.bo.NewsBo;
import com.subaozuche.comm.utils.ConstDescription;
import com.subaozuche.comm.utils.ConstKeywords;
import com.subaozuche.comm.utils.ConstTitle;
import com.subaozuche.comm.utils.newPagination;
import com.subaozuche.model.News;

@Controller
@RequestMapping("")
public class NewsCenterController {
	private static final String VIEW_DIR = "frontend/news/";
	private ModelAndView view = new ModelAndView();
	private static int DEFAULT_PAGE_SIZE = 10;
	private int itemPerPage = DEFAULT_PAGE_SIZE;
	private List<News> curNewsList = new ArrayList<News>();
	private static int totalNews;

	@Autowired
	private NewsBo newsBo;

	@RequestMapping(value = "news", method = RequestMethod.GET)
	public ModelAndView newsCenter() {
		view.addObject("title", ConstTitle.NEWS);
		view.addObject("keywords", ConstKeywords.NEWS);
		view.addObject("description", ConstDescription.NEWS);
		view.addObject("industryNewses",
				getCurrentList(newsBo.findByType(0), 1));
		view.addObject("companyNewses", getCurrentList(newsBo.findByType(1), 1));
		view.setViewName(VIEW_DIR + "center");
		return view;
	}

	@RequestMapping(value = "industry", method = RequestMethod.GET)
	public ModelAndView newsIndustry() {
		view.addObject("title", ConstTitle.INDUSTRY);
		view.addObject("keywords", ConstKeywords.INDUSTRY);
		view.addObject("description", ConstDescription.INDUSTRY);
		view.addObject("industryNewses",
				getCurrentList(newsBo.findByType(0), 1));
		view.addObject("pageStr", newPagination.paginate("/industry/page/", 1, itemPerPage, totalNews, 2));
		view.setViewName(VIEW_DIR + "industry");
		return view;
	}
	
	@RequestMapping(value = "/industry/page/{id}")
	public ModelAndView industryPagination(@PathVariable int id) {
		view.addObject("title", ConstTitle.INDUSTRY);
		view.addObject("keywords", ConstKeywords.INDUSTRY);
		view.addObject("description", ConstDescription.INDUSTRY);
		view.addObject("industryNewses",
				getCurrentList(newsBo.findByType(0), id));
		view.addObject("pageStr", newPagination.paginate("/industry/page/", id, itemPerPage, totalNews, 2));
		view.setViewName(VIEW_DIR + "industry");
		return view;
	}

	@RequestMapping(value = "/industry/{id}.html", method = RequestMethod.GET)
	public ModelAndView industryDetailAction(@PathVariable int id) {		
		News news = newsBo.findById(id);
		view.addObject("title", news.getTitle());
		view.addObject("keywords", ConstKeywords.INDUSTRY);
		view.addObject("description", ConstDescription.INDUSTRY);
		view.addObject("industryNews", news);
		view.addObject("neigbourPre", newsBo.getNeigbourPre(news));
		view.addObject("neigbourNext", newsBo.getNeigbourNext(news));
		view.addObject("tag", "industry");
		view.setViewName(VIEW_DIR + "industry_detail");
		return view;
	}

	@RequestMapping(value = "company", method = RequestMethod.GET)
	public ModelAndView newsCompany() {
		view.addObject("title", ConstTitle.COMPANY);
		view.addObject("keywords", ConstKeywords.COMPANY);
		view.addObject("description", ConstDescription.COMPANY);
		view.addObject("companyNewses", getCurrentList(newsBo.findByType(1), 1));
		view.addObject("pageStr", newPagination.paginate("/company/page/", 1, itemPerPage, totalNews, 2));
		view.setViewName(VIEW_DIR + "company");
		return view;
	}

	@RequestMapping(value = "/company/page/{id}")
	public ModelAndView companyPagination(@PathVariable int id) {
		view.addObject("title", ConstTitle.COMPANY);
		view.addObject("keywords", ConstKeywords.COMPANY);
		view.addObject("description", ConstDescription.COMPANY);
		view.addObject("companyNewses",
				getCurrentList(newsBo.findByType(1), id));
		view.addObject("pageStr", newPagination.paginate("/company/page/", id, itemPerPage, totalNews, 2));
		view.setViewName(VIEW_DIR + "company");
		return view;
	}

	@RequestMapping(value = "/company/{id}.html", method = RequestMethod.GET)
	public ModelAndView companyDetailAction(@PathVariable int id) {
		News news = newsBo.findById(id);
		view.addObject("title", news.getTitle());
		view.addObject("keywords", ConstKeywords.COMPANY);
		view.addObject("description", ConstDescription.COMPANY);
		view.addObject("companyNews", news);
		view.addObject("neigbourPre", newsBo.getNeigbourPre(news));
		view.addObject("neigbourNext", newsBo.getNeigbourNext(news));
		view.addObject("tag", "company");
		view.setViewName(VIEW_DIR + "company_detail");
		return view;
	}

	private List<News> getCurrentList(List<News> newsList, int id) {
		totalNews = newsList.size();
		curNewsList.clear();
		int startId = (id - 1) * itemPerPage;
		int endId = startId + itemPerPage;
		for (int i = startId; i < totalNews && i < endId; i++) {
			curNewsList.add(newsList.get(i));
		}
		return curNewsList;
	}
}
