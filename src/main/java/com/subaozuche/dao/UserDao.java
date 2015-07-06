package com.subaozuche.dao;

/**
 * @author jacky
 * */

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.subaozuche.model.User;

public interface UserDao {

	@Select("SELECT id, user_name AS userName, user_pass AS userPass, created_at AS createdAt, updated_at AS updateAt "
			+ "FROM `users` WHERE id=#{id} ")
	public User findById(int id);

	@Select("SELECT id, user_name AS userName, user_pass AS userPass, created_at AS createdAt, updated_at AS updateAt "
			+ "FROM `users`")
	public List<User> findAll();

	public void add(User user);

	@Update("UPDATE SET user_name=#{userName}, user_pass=#{userPass}, update_at=#{updateAt} `users` WHERE id=#{id}")
	public void update(User user);

	@Delete("DELETE FROM `users` WHERE id=#{id}")
	public void delete(int id);
}
