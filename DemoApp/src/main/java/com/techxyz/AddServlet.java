package com.techxyz;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class AddServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException  {   //you have to go with this method name. service belongs to the service life cycle
		
		//request always goes to service method
		//do post will only work with a post request
		
		int i = Integer.parseInt(req.getParameter("num1"));
		
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		//query string is when the input is passed as a string to the url
		
//		  PrintWriter out = res.getWriter(); //res goes from server to client
//		
//		out.println("Result: " + k);
		req.setAttribute("k", k);
		
		
		//using req dispatcher to choose servlet
		RequestDispatcher rd = req.getRequestDispatcher("sq");
		rd.forward(req, res);
		
		
	}

}
