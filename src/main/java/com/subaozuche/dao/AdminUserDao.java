package com.subaozuche.dao;

/**
 * @author jacky
 * */

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.subaozuche.model.AdminUser;

public interface AdminUserDao {

	@Select("SELECT id, user_name AS userName, user_pass AS userPass, updated_at AS updateAt "
			+ "FROM `admin_user` WHERE id=#{id} ")
	public AdminUser findById(int id);

	@Select("SELECT id, user_name AS userName, user_pass AS userPass, updated_at AS updateAt "
			+ "FROM `admin_user`")
	public List<AdminUser> findAll();

	public void add(AdminUser user);

	@Update("UPDATE SET user_name=#{userName}, user_pass=#{userPass}, update_at=#{updateAt} `admin_user` WHERE id=#{id}")
	public void update(AdminUser user);

	@Delete("DELETE FROM `admin_user` WHERE id=#{id}")
	public void delete(int id);
}
