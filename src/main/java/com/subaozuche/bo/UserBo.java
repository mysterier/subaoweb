package com.subaozuche.bo;

import java.util.List;

import com.subaozuche.model.User;

public interface UserBo {
	public User findById(int id);

	public List<User> findAll();

	public void add(User user);

	public void update(User user);

	public void delete(int id);
}
