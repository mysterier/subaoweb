package com.subaozuche.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.subaozuche.model.News;

public interface NewsDao {
	@Select("SELECT id, title, content, created_at AS createdAt, updated_at AS updatedAt FROM tbl_news WHERE id=#{id}")
	public News findById(int id);

	@Select("SELECT id, title, content, created_at AS createdAt, updated_at AS updatedAt FROM tbl_news")
	public List<News> findAll();

	public void add(News news);

	@Update("UPDATE tbl_news SET title=#{title}, content=#{content}, created_at=#{createdAt},"
			+ " updated_at=#{updatedAt} WHERE id=#{id}")
	public void update(News news);

	@Delete("DELETE FROM tbl_news WHERE id=#{id}")
	public void delete(int id);
}
