package com.subaozuche.model;

import java.sql.Date;

public class Activity {
	private int id;
	private String title;
	private String city;
	private String activityIntro;
	private String content;
	private Date activityStart;
	private Date activityEnd;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getActivityIntro() {
		return activityIntro;
	}

	public void setActivityIntro(String activityIntro) {
		this.activityIntro = activityIntro;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getActivityStart() {
		return activityStart;
	}

	public void setActivityStart(Date activityStart) {
		this.activityStart = activityStart;
	}

	public Date getActivityEnd() {
		return activityEnd;
	}

	public void setActivityEnd(Date activityEnd) {
		this.activityEnd = activityEnd;
	}

	@Override
	public String toString() {
		return "Activity [id=" + id + ", title=" + title + ", city=" + city
				+ ", activityIntro=" + activityIntro + ", content=" + content
				+ ", activityStart=" + activityStart + ", activityEnd="
				+ activityEnd + "]";
	}
}
