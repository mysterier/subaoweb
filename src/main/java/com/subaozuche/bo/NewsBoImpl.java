package com.subaozuche.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subaozuche.dao.NewsDao;
import com.subaozuche.model.News;

@Service("newsBo")
public class NewsBoImpl implements NewsBo {

	@Autowired
	private NewsDao newsDao;

	@Override
	public News findById(int id) {
		return newsDao.findById(id);
	}

	@Override
	public List<News> findAll() {
		return newsDao.findAll();
	}

	@Override
	public void add(News news) {
		newsDao.add(news);
	}

	@Override
	public void update(News news) {
		newsDao.update(news);
	}

	@Override
	public void delete(int id) {
		newsDao.delete(id);
	}

}
