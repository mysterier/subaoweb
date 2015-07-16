package com.subaozuche.model;

import java.io.Serializable;

import org.hibernate.validator.constraints.NotBlank;

public class ClientLoginForm implements Serializable {
	private static final long serialVersionUID = -5353434704551543376L;

	@NotBlank(message = "用户名不能为空")
	private String clientName = null;
	@NotBlank(message = "密码不能为空")
	private String clientPass = null;

	public String getClientName() {
		return clientName;
	}

	public void setClientName(String clientName) {
		this.clientName = clientName;
	}

	public String getClientPass() {
		return clientPass;
	}

	public void setClientPass(String clientPass) {
		this.clientPass = clientPass;
	}
}
