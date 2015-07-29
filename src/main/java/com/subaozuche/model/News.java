package com.subaozuche.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotBlank;

public class News {
	private int id;
	@NotBlank(message = "主题不能为空")
	private String title;
	@NotBlank(message = "内容不能为空")
	private String content;
	private Timestamp createdAt;
	private Timestamp updatedAt = new Timestamp(new Date().getTime());
	@Min(0)
	@Max(1)
	private int type;
	private String typeName;

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

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getTypeString() {
		switch (this.type) {
		case 0:
			typeName = "行业新闻";
			break;
		case 1:
			typeName = "公司新闻";
			break;
		}
		return typeName;
	}

	@Override
	public String toString() {
		return "News [id=" + id + ", title=" + title + ", content=" + content
				+ ", createdAt=" + createdAt + ", updatedAt=" + updatedAt
				+ ", type=" + type + "]";
	}
}
