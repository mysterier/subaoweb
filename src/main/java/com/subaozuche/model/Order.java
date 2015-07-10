package com.subaozuche.model;

import java.sql.Timestamp;

public class Order {
	private int id;
	private int cityId;
	private Timestamp rentTime;
	private String contactName;
	private String contactPhone;
	private int rentType;
	private String rentOther;
	private int clientId;
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