package com.subaozuche.bo;

import java.util.List;

import com.subaozuche.model.Recruit;

public interface RecruitBo {
	public Recruit findById(int id);
	
	public Recruit findByTitle(String title);

	public List<Recruit> findAll();

	public void add(Recruit recruit);

	public void update(Recruit recruit);

	public void delete(int id);
}
