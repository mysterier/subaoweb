package com.subaozuche.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subaozuche.dao.AdminUserDao;
import com.subaozuche.model.AdminUser;

@Service("userBo")
public class AdminUserBoImpl implements AdminUserBo {
	@Autowired
	private AdminUserDao userDao;

	@Override
	public AdminUser findById(int id) {
		return userDao.findById(id);
	}

	@Override
	public List<AdminUser> findAll() {
		return userDao.findAll();
	}

	@Override
	public void add(AdminUser user) {
		userDao.add(user);
	}

	@Override
	public void update(AdminUser user) {
		userDao.update(user);
	}

	@Override
	public void delete(int id) {
		userDao.delete(id);
	}

}
