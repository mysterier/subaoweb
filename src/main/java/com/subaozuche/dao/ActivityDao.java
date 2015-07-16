package com.subaozuche.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.subaozuche.model.Activity;

public interface ActivityDao {
	@Select("SELECT id, title, city, activity_intro AS activityIntro, content, activity_start AS activityStart, "
			+ "activity_end AS activityEnd FROM tbl_activity WHERE id=#{id}")
	public Activity findById(int id);

	@Select("SELECT id, title, city, activity_intro AS activityIntro, content, activity_start AS activityStart, "
			+ "activity_end AS activityEnd FROM tbl_activity")
	public List<Activity> findAll();

	public void add(Activity activity);

	@Update("UPDATE tbl_activity SET title=#{title}, city=#{city}, activity_intro=#{activityIntro}, content=#{content}, "
			+ "activity_start=#{activityStart}, activity_end=#{activityEnd} WHERE id=#{id}")
	public void update(Activity activity);

	@Delete("DELETE FROM tbl_news WHERE id=#{id}")
	public void delete(int id);
}
