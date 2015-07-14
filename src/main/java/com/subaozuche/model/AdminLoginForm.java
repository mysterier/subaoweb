package com.subaozuche.model;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

public class AdminLoginForm implements Serializable {
	private static final long serialVersionUID = -5353434704551543376L;

	@NotBlank(message = "用户名不能为空")
	private String userName = null;
	@NotBlank(message = "密码不能为空")
	private String userPass = null;

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
}
