package com.techxyz;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class AddServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException  {   //you have to go with this method name. service belongs to the service life cycle
		
		//request always goes to service method
		//do post will only work with a post request
		
		int i = Integer.parseInt(req.getParameter("num1"));
		
		int j = Integer.parseInt(req.getParameter("num2"));
		
		int k = i + j;
		//query string is when the input is passed as a string to the url
//		
//		HttpSession session = req.getSession();
//		session.setAttribute("k", k);
//		
		//SEND REDIRECT
		
		
		
		//cookie is more like a token that remembers your face regardless
		
		Cookie cookie = new Cookie("k", k + "");
		res.addCookie(cookie);
		
		res.sendRedirect("sq"); //telling client to call sqServlet
		
		
		
//		  PrintWriter out = res.getWriter(); //res goes from server to client
//		
//		out.println("Result: " + k);
//		req.setAttribute("k", k);
		
		//request object will have all the data which our servlet needs
		
		//response object will have all the data which the client needs
		
		
		//using req dispatcher to choose servlet
//		RequestDispatcher rd = req.getRequestDispatcher("sq");
//		rd.forward(req, res);
		
	
//		
		
	}

}
