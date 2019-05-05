package com.ubaid.app.controller.routers;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ubaid.app.controller.UserType;
import com.ubaid.app.model.Users.Teacher;
import com.ubaid.app.model.Users.User;
import com.ubaid.app.model.dao.DAO;
import com.ubaid.app.model.logic.Logic;
import com.ubaid.app.model.logic.TeacherLogic;

/**
 * Servlet implementation class SubmissionConfirm
 */
public class SubmissionConfirm extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SubmissionConfirm() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{

		User user = null;
		Logic logic = null;
		String type = UserType.getUserType();
		
		
		if(type.equals("teacher"))
		{
					user = new Teacher.Builder()
								.age("15")
								.email(request.getParameter("email"))
								.password(request.getParameter("password"))
								.gender(request.getParameter("gender"))
								.name(request.getParameter("name"))
								.build();
					logic = new TeacherLogic();

		}
		boolean what = logic.add(user);
		
		if(what)
		{
			PrintWriter out = response.getWriter();
		    out.println("<h5>" + user.toString() + "</h5>");
		    out.println("<h1>" + "Submitter successfully" + "</h1>");
		    
		    try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		    request.getRequestDispatcher("src/successfull/successfull.html").forward(request, response);
		}
		else
		{
		    
		    request.getRequestDispatcher("src/error/error.html").forward(request, response);

		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
