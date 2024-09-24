package com.contextlistener;

import javax.servlet.*;

public class ServletContextListener implements javax.servlet.ServletContextListener{
	
	
	public void contextDestroyed(ServletContextEvent sced) {
		
		System.out.println("Context Destroyed");
	
	}
	
	
	
	public void contextInitialized(ServletContextEvent scei) {
	
		ServletContext context = scei.getServletContext();
		String parameter = context.getInitParameter("create tables");
		if (parameter.equals("YES")) {
			
			System.out.println("Creating Tables");
			
			String realPath = context.getRealPath("");
			
			//new DbIni
			
		}
	}
	

}
