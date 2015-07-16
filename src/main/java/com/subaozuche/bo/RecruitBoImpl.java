package com.subaozuche.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subaozuche.dao.RecruitDao;
import com.subaozuche.model.Recruit;

@Service("recruitBo")
public class RecruitBoImpl implements RecruitBo {

	@Autowired
	private RecruitDao recruitDao;

	@Override
	public Recruit findById(int id) {
		return recruitDao.findById(id);
	}

	@Override
	public Recruit findByTitle(String title) {
		return recruitDao.findByTitle(title);
	}

	@Override
	public List<Recruit> findAll() {
		return recruitDao.findAll();
	}

	@Override
	public void add(Recruit recruit) {
		recruitDao.add(recruit);
	}

	@Override
	public void update(Recruit recruit) {
		recruitDao.update(recruit);
	}

	@Override
	public void delete(int id) {
		recruitDao.delete(id);
	}
}
