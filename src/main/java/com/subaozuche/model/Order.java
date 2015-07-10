package com.subaozuche.model;

import java.sql.Timestamp;

import org.hibernate.validator.constraints.NotBlank;

public class Order {
	private int id;
	@NotBlank(message = "城市Id不能为空")
	private int cityId;
	@NotBlank(message = "城市Id不能为空")
	private Timestamp rentTime;
	@NotBlank(message = "联系人不能为空")
	private String contactName;
	@NotBlank(message = "联系电话不能为空")
	private String contactPhone;
	@NotBlank(message = "车型不能为空")
	private int rentType;
	private String rentOther;
	@NotBlank(message = "用户id不能为空")
	private int clientId;
	@NotBlank(message = "创建时间不能为空")
	private Timestamp createdAt;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCityId() {
		return cityId;
	}

	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	public Timestamp getRentTime() {
		return rentTime;
	}

	public void setRentTime(Timestamp rentTime) {
		this.rentTime = rentTime;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public int getRentType() {
		return rentType;
	}

	public void setRentType(int rentType) {
		this.rentType = rentType;
	}

	public String getRentOther() {
		return rentOther;
	}

	public void setRentOther(String rentOther) {
		this.rentOther = rentOther;
	}

	public int getClientId() {
		return clientId;
	}

	public void setClientId(int clientId) {
		this.clientId = clientId;
	}

	public Timestamp getcreatedAt() {
		return createdAt;
	}

	public void setcreatedAt(Timestamp createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + ", cityId=" + cityId + ", rentTime="
				+ rentTime + ", contactName=" + contactName + ", contactPhone="
				+ contactPhone + ", rentType=" + rentType + ", rentOther="
				+ rentOther + ", clientId=" + clientId + ", createdAt="
				+ createdAt + "]";
	}
}
