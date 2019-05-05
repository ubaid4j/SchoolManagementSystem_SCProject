package com.ubaid.app.model.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Random;

import com.ubaid.app.model.Users.Teacher;
import com.ubaid.app.model.Users.User;
import com.ubaid.app.model.singleton.DataSource;

public class TeacherDAO implements DAO
{
	private static String q1 = "INSERT INTO users values(?, ?, ?, ?, ?, ?)";
	private static String q2 = "INSERT INTO teacher values(?, ?, ?)";
	private static Random random = new Random();
	
	private long generateID()
	{
		return random.nextLong();
	}
	
	@Override
	public boolean add(User user)
	{
		try
		{
			long id = generateID();
			Connection connection = DataSource.getConnection();
			PreparedStatement st = connection.prepareStatement(q1);
			
			Teacher teacher = (Teacher) user;
			
			st.setLong(1, id);
			st.setString(2, teacher.getName());
			st.setInt(3, 25);
			st.setString(4, teacher.getEmail());
			st.setString(5, teacher.getGender());
			st.setString(6, teacher.getPassword());
			
			st.executeUpdate();
			
			st = connection.prepareStatement(q2);
			st.setLong(1, id);
			st.setString(2, teacher.getSpeciality());
			st.setString(3, teacher.getCourses());
			st.executeUpdate();
			
			return true;
			
		}
		catch(Exception exp)
		{
			return false;
		}
	}

}
