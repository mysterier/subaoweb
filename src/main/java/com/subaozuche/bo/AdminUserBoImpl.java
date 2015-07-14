package com.subaozuche.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subaozuche.dao.AdminUserDao;
import com.subaozuche.model.AdminUser;

@Service("adminUserBo")
public class AdminUserBoImpl implements AdminUserBo {
	@Autowired
	private AdminUserDao adminUserDao;

	@Override
	public AdminUser findById(int id) {
		return adminUserDao.findById(id);
	}

	@Override
	public List<AdminUser> findAll() {
		return adminUserDao.findAll();
	}

	@Override
	public void add(AdminUser adminUser) {
		adminUserDao.add(adminUser);
	}

	@Override
	public void update(AdminUser adminUser) {
		adminUserDao.update(adminUser);
	}

	@Override
	public void delete(int id) {
		adminUserDao.delete(id);
	}

	@Override
	public AdminUser findByUserName(String userName) {
		return adminUserDao.findByUserName(userName);
	}

}
