package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.*;
import javax.servlet.http.*;



public class HomeServlet extends HttpServlet{
	
	public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException{
		
		response.setContentType("text/html");
		
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<h2>WElcome to Register Form</h2>");
		
		//fetching data here name filed in html page 
		String name = request.getParameter("user_Name");
		String email = request.getParameter("user_Email");
		String mobile = request.getParameter("user_Mobile");
		String password = request.getParameter("user_Password");
		
		// printing atribute on web page
		
		printWriter.println("<h2> Name :  </h2> "+name);
		printWriter.println("<h2> Email : </h2>"+email);
		printWriter.println("<h2> Mobile Number : </h2>"+mobile);
		printWriter.println("<h2> Password  : </h2>"+password);
		
		// using include method get the object requestDistpacher  
		//pass servlet url patten in getRequestDispathcer method
		RequestDispatcher dispatcher = request.getRequestDispatcher("index.html");
		dispatcher.include(request, response);
		
		//pass servlet url patten in getRequestDispathcer method
//		RequestDispatcher dispatcher1 = request.getRequestDispatcher("HomeForward");
//		dispatcher1.forward(request, response);
		

		
	}

}
