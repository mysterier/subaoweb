package com.subaozuche.model;

import java.sql.Timestamp;

import org.hibernate.validator.constraints.NotBlank;

public class News {
	private int id;
	@NotBlank(message = "主题不能为空")
	private String title;
	@NotBlank(message = "内容不能为空")
	private String content;
	@NotBlank(message = "创建时间不能为空")
	private Timestamp createdAt;
	@NotBlank(message = "更新时间不能为空")
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
		return "News [id=" + id + ", title=" + title + ", content=" + content
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
}
