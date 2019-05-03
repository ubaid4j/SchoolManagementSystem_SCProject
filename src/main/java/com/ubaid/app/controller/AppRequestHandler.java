package com.ubaid.app.controller;

import java.io.IOException;
import java.io.Writer;
import java.util.Hashtable;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;

import com.ubaid.app.model.strategy.RequestHandler;
import com.ubaid.app.model.strategy.SignIn;
import com.ubaid.app.model.strategy.SignUp;



public class AppRequestHandler extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	static Hashtable<String, RequestHandler> classHash;
	
	public AppRequestHandler()
    {
        super();
    }

	
	
	@Override
	public void init() throws ServletException
	{
		super.init();		
		classHash = new Hashtable<>();
		classHash.put("signIn", new SignUp());		
		classHash.put("signUp", new SignIn());
	}
		
	//when our container decides to eliminate the 
	//the servlet, then this method called 
	//and this method, simply stop the scheduler and close the connection
	@Override
	public void destroy()
	{
		super.destroy();
	}


	//on each get request
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException
	{
				
		try
		{
			//first we find the className from the parameter of the request
			String className = request.getParameter("className");
			JSONArray array = null;
			
			try
			{
				//getting Map of parameters
				Map<String, String[]> map = request.getParameterMap();
				
				//getting Request handler class according to className
				RequestHandler handler = classHash.get(className);
				
				//getting JSON array from the request handler get method
				array = handler.get(map);	
				
				if(array == null)
					throw new NullPointerException();
			}
			catch(NullPointerException exp)
			{
				if(className == "signIn")
				{
					request.getRequestDispatcher("src/index/options.html").include(request, response);									
				}
			}
			
			if(array != null)
			{
				//after that, writer writes the JSON array to response
				Writer writer = response.getWriter();
				writer.write(array.toString());
				writer.flush();				
			}
			
		}
		catch(IOException exp)
		{
			exp.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		doGet(request, response);
	}

}
