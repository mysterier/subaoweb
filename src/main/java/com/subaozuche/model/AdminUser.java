package com.subaozuche.model;

import java.sql.Timestamp;

import org.hibernate.validator.constraints.NotBlank;

public class AdminUser {
	private int id;
	
	@NotBlank(message = "用户名不能为空")
	private String userName;
	@NotBlank(message = "密码不能为空")
	private String userPass;
	private Timestamp updatedAt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}
}
