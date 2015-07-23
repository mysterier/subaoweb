package com.subaozuche.bo;

import java.util.List;

import com.subaozuche.model.News;

public interface NewsBo {
	public News findById(int id);
	
	public List<News> findByType(int type);
	
	public News findByTitle(String title);

	public List<News> findAll();

	public void add(News news);

	public void update(News news);

	public void delete(int id);
	
	public News getNeigbourPre(News news);
	public News getNeigbourNext(News news);
}
