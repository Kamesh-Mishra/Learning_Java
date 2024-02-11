package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
	
		String n = request.getParameter("username");
		writer.println("welcome "+n);
		
		HttpSession session = request.getSession();
		
		ServletContext ctx = request.getServletContext();
		int t = (Integer) ctx.getAttribute("totalusers");
		int c = (Integer) ctx.getAttribute("currentusers");
		writer.print("<br>total users = "+t);
		writer.print("<br>current users = "+c);
		
		writer.print("<br> <a href='LogoutServlet'>Logout</a>");
		writer.close();
		
	}

}
