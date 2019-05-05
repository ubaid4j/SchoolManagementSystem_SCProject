package com.ubaid.app.model.dao;

import com.ubaid.app.model.Users.User;

public interface DAO
{
	public boolean add(User user);
	public User getUser(String email);
}
