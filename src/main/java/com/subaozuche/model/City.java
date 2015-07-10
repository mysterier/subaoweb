package com.subaozuche.model;

import org.hibernate.validator.constraints.NotBlank;

public class City {
	private int id;
	@NotBlank(message = "城市不能为空")
	private String cityName;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", cityName=" + cityName + "]";
	}
}
