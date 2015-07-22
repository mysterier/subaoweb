package com.subaozuche.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.subaozuche.model.Recruit;

public interface RecruitDao {

	@Select("SELECT id, title, content, updated_at AS updatedAt FROM tbl_recruit WHERE id=#{id}")
	public Recruit findById(int id);

	@Select("SELECT id, title, content, updated_at AS updatedAt FROM tbl_recruit WHERE title=#{title}")
	public Recruit findByTitle(String title);
	
	@Select("SELECT id, title, content, updated_at AS updatedAt FROM tbl_recruit ORDER BY updated_at DESC")
	public List<Recruit> findAll();

	public void add(Recruit recruit);

	@Update("UPDATE tbl_recruit SET title=#{title}, content=#{content}, updated_at=#{updatedAt} WHERE id=#{id}")
	public void update(Recruit recruit);

	@Delete("DELETE FROM tbl_recruit WHERE id=#{id}")
	public void delete(int id);
}
