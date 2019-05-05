package com.ubaid.app.controller.routers;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class User
 */
public class User extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public User() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Map<String, String[]> map = request.getParameterMap();
		
		String password = request.getParameter("user_password");
		String name = request.getParameter("user_name");
		String userType = request.getParameter("userType");
		
		if(userType.equals("teacher"))
		{
			request.getRequestDispatcher("src/teacher-profile/teacher-profile.html").forward(request, response);
		}
		else if(userType.equals("student"))
		{
			request.getRequestDispatcher("src/student-profile/student-profile.html").forward(request, response);			
		}
		else if(userType.contentEquals("admin"))
		{
			request.getRequestDispatcher("src/admin-profile/admin-profile.html").forward(request, response);						
		}
		
		assert(map != null);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
