package com.dao;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ServletDbConnection extends HttpServlet{
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		
		// get parameter 
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String address = req.getParameter("address");
		
		// connection established 
		
		try {
			
			// register the driver manager mysql database
			Class.forName("com.mysql.jdbc.Driver"); 	
			
			// Connection Established and pass url in method(getConnection) and user, password of database
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/servletjdbc", "root", "root");
			
			// create object of preparedstatement and pass the query(select * from like..) in prepareStatemetn() method
			PreparedStatement preparedStatement = connection.prepareStatement("insert into register values (?,?,?)");
			
			// set the argument with number 
			preparedStatement.setString(1, name);
			preparedStatement.setString(2, email);
			preparedStatement.setString(3, address);
			
			// using this method executeupdate() queary for get data 
			
			int i = preparedStatement.executeUpdate();
			
			// if else conditions 
			
			if(i>0) {
				out.println("Successfully Registered");
			}
			
	
			
		} catch (Exception e) {
		  System.out.println(e);
		}
		
	
		
	}

}
