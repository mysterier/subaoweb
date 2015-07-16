package com.subaozuche.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subaozuche.dao.ActivityDao;
import com.subaozuche.model.Activity;

@Service("activityBo")
public class ActivityBoImpl implements ActivityBo{

	@Autowired
	private ActivityDao activityDao;
	
	@Override
	public Activity findById(int id) {
		return activityDao.findById(id);
	}

	@Override
	public List<Activity> findAll() {
		return activityDao.findAll();
	}

	@Override
	public void add(Activity activity) {
		activityDao.add(activity);		
	}

	@Override
	public void update(Activity activity) {
		activityDao.update(activity);
	}

	@Override
	public void delete(int id) {
		activityDao.delete(id);
	}

	
}
