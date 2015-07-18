package com.subaozuche.model;

import java.sql.Timestamp;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;

public class Client {
	private int id;
	@Pattern(regexp="^(?:(?:1(?:3[4-9]|5[012789]|8[78])[0-9]{8}|1(?:3[0-2]|5[56]|8[56])[0-9]{8}|18[0-9][0-9]{8}|1[35]3[0-9]{8})|14[57][0-9]{8}|170[059][0-9]{7}|17[67][0-9]{8})$", message="手机格式错误")
	private String mobile;
	@NotBlank(message = "用户名不能为空")
	//todo 登录名唯一验证
	private String clientName;
	@NotBlank(message = "用户密码不能为空")
	@Length(min = 6, max = 16)
	private String clientPass;
	@NotBlank(message = "邮箱地址不能为空")
	@Email(message = "请输入正确的邮箱地址")
	private String clientEmail;
	private Timestamp createdAt;
	private Timestamp updatedAt;
	
	private String passAgain;

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

	public String getPassAgain() {
		return passAgain;
	}

	public void setPassAgain(String passAgain) {
		this.passAgain = passAgain;
	}

	@Override
	public String toString() {
		return "Client [id=" + id + ", mobile=" + mobile + ", clientName="
				+ clientName + ", clientPass=" + clientPass + ", clientEmail="
				+ clientEmail + ", createdAt=" + createdAt + ", updatedAt="
				+ updatedAt + ", passAgain=" + passAgain + "]";
	}
}
