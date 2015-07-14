package com.subaozuche.model;

import java.sql.Timestamp;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

public class Client {
	private int id;
	@NotBlank(message = "手机号不能为空")
	private String mobile;
	@NotBlank(message = "用户名不能为空")
	private String clientName;
	@NotBlank(message = "用户密码不能为空")
	private String clientPass;
	@NotBlank(message = "邮箱地址不能为空")
	@Email(message = "请输入正确的邮箱地址")
	private String clientEmail;
	private Timestamp createdAt;
	private Timestamp updatedAt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

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

	public String getClientEmail() {
		return clientEmail;
	}

	public void setClientEmail(String clientEmail) {
		this.clientEmail = clientEmail;
	}

	public Timestamp getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", mobile=" + mobile + ", clientName="
				+ clientName + ", clientPass=" + clientPass + ", clientEmail="
				+ clientEmail + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + "]";
	}
}
