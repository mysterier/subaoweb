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

	@Select("SELECT id, user_name AS userName, user_pass AS userPass, updated_at AS updatedAt "
			+ "FROM `tbl_admin_user` WHERE id=#{id} ")
	public AdminUser findById(int id);

	@Select("SELECT id, user_name AS userName, user_pass AS userPass, updated_at AS updatedAt "
			+ "FROM `tbl_admin_user`")
	public List<AdminUser> findAll();

	public void add(AdminUser user);

	@Update("UPDATE `tbl_admin_user` SET user_name=#{userName}, user_pass=#{userPass}, updated_at=#{updatedAt} WHERE id=#{id}")
	public void update(AdminUser user);

	@Delete("DELETE FROM `tbl_admin_user` WHERE id=#{id}")
	public void delete(int id);
}
