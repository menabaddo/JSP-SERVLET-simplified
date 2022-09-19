package com.techxyz;

import java.io.IOException;
import java.io.PrintWriter;

import org.apache.tomcat.util.http.parser.Cookie;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/sq") //annotation to specify the servlet
public class SqServlet extends HttpServlet {
	
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException{
		
		
		jakarta.servlet.http.Cookie[] cookies = req.getCookies(); //getting all cookies coming from client
		int k = 0;
		
		for(jakarta.servlet.http.Cookie c : cookies)  { //checking all cookies and checking the name for  exact cookies
			if(c.getName().equals("k")) {
				k = Integer.parseInt(c.getValue());
				
			}
		}
		
		
//		HttpSession session = req.getSession();
//		
////		session.removeAttribute("k"); to remove a value from a session
//		
//		//session can be used to manage the login of your website.
//		
//		
//		int k = (int)session.getAttribute("k");

		
	
		//used in url rewriting, getting parameter directly from url
		//		int k = Integer.parseInt(req.getParameter("k"));
		
		k = k * k;
		
		PrintWriter out = res.getWriter();
		out.println("Square from addServlet = " + k);
	
		
		System.out.println("sq called");
	 
}
	
}
