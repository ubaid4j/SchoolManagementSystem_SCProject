package com.ubaid.app.model.logic;

import com.ubaid.app.model.Users.User;
import com.ubaid.app.model.dao.DAO;
import com.ubaid.app.model.dao.TeacherDAO;

public class TeacherLogic implements Logic
{

	@Override
	public boolean add(User user)
	{
		DAO dao = new TeacherDAO();
		return dao.add(user);
	}

	@Override
	public User get(String email) {
		// TODO Auto-generated method stub
		return null;
	}

}
