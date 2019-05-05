package com.ubaid.app.model.logic;

import com.ubaid.app.model.Users.User;

public interface Logic
{
	public boolean add(User user);
	public User get(String email);
}
