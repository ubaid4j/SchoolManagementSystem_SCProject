package com.ubaid.app.controller;

public class UserType
{
	private static String userType;

	public static String getUserType() {
		return userType;
	}

	public static void setUserType(String userType) {
		UserType.userType = userType;
	}
	
}
