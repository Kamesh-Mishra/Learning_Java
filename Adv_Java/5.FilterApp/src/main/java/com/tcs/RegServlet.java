package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class RegServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public RegServlet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		String uname = request.getParameter("uname");
		String uage = request.getParameter("uage");
		String uaddr = request.getParameter("uaddr");
		
		
		writer.println("************** UR REGISTRATION SUCCESS  *******************");
		writer.println("<br>");
		writer.println("user name = "+uname);
		writer.println("<br>");
		writer.println("<br>");
		writer.println("user age = "+uage);
		writer.println("<br>");
		writer.println("<br>");
		writer.println("user address = "+uaddr);
		writer.println("<br>");
		writer.println("<br>");
		writer.println("user registration id=13456");
		writer.println("<br>");
		writer.println("we will find one girl for you soon ...... keep smiling");
	}

}
