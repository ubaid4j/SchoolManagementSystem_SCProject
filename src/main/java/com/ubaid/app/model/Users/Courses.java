package com.ubaid.app.model.Users;

import java.util.List;

public class Courses extends User
{
	private List<Course> courses;
	private long teacherId;
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	public long getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(long teacherId) {
		this.teacherId = teacherId;
	}
	
	
}