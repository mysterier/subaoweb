package com.subaozuche.bo;

import java.util.List;

import com.subaozuche.model.Activity;

public interface ActivityBo {
	public Activity findById(int id);

	public List<Activity> findAll();

	public void add(Activity activity);

	public void update(Activity activity);

	public void delete(int id);
}
