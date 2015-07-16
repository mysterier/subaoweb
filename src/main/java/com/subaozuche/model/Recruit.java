package com.subaozuche.model;

import java.sql.Timestamp;

import org.hibernate.validator.constraints.NotBlank;

public class Recruit {
	private int id;
	@NotBlank(message = "请填写标题")
	private String title;
	private String content;
	private Timestamp updatedAt;

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

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Timestamp getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Timestamp updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public String toString() {
		return "Recruit [id=" + id + ", title=" + title + ", content="
				+ content + ", updatedAt=" + updatedAt + "]";
	}
}
