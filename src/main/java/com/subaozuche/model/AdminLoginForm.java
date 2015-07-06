package com.subaozuche.model;

import java.io.Serializable;

public class AdminLoginForm implements Serializable {
	private static final long serialVersionUID = -5353434704551543376L;

	private String userName = null;
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
