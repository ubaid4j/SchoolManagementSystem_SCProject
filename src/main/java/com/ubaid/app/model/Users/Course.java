package com.ubaid.app.model.Users;

import java.sql.Blob;

public class Course
{
	private String description;
	private String name;
	private Blob file;
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Blob getFile() {
		return file;
	}
	public void setFile(Blob file) {
		this.file = file;
	}
	
	
}
