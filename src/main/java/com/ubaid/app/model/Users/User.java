package com.ubaid.app.model.Users;

public abstract class User {
	String name;
	String password;
	String age;
	String gender;
	String email;
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	public String getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getEmail() {
		return email;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", password=" + password + ", age=" + age + ", gender=" + gender + ", email="
				+ email + "]";
	}
	
	
	

}
