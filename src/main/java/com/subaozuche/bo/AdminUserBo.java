package com.subaozuche.bo;

import java.util.List;

import com.subaozuche.model.AdminUser;

public interface AdminUserBo {
	public AdminUser findById(int id);

	public List<AdminUser> findAll();

	public void add(AdminUser user);

	public void update(AdminUser user);

	public void delete(int id);
	
	public AdminUser findByUserName(String userName);
}
