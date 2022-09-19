package com.techxyz;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyServlet extends HttpServlet {
	/**
	 * ServletConfig && ServletContext
	 * @throws IOException 
	 */
	
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		
		PrintWriter out = res.getWriter();
		out.print("Hi ");
		
		ServletContext ctx = getServletContext();
		String str = ctx.getInitParameter("Phone");
		out.print(str);
		
		//you could use this to specify the username and password for database.
		
		//servletContext is shared by all the servlets
		
	}
	
	

}
