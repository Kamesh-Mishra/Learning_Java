package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet{

	
	public void destroy() {
		System.out.println("destroy() method");
		
	}

	
	public ServletConfig getServletConfig() {
		System.out.println("getServletConfig() method");
		return null;
	}

	
	public String getServletInfo() {
		System.out.println("getServletInfo() method");
		return null;
	}

	
	public void init(ServletConfig arg0) throws ServletException {
		System.out.println("init() method");
		
	}

	
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		System.out.println("service() method");
		
		//general setting
		
		arg1.setContentType("text/html");
		PrintWriter writer= arg1.getWriter();

		writer.println("this is first servlet application..");
		writer.println("this is first servlet application..");
		
		
	}

}
