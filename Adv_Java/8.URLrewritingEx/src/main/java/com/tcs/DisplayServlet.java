package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		HttpSession session = request.getSession(false);
		
		writer.println("User name ="+session.getAttribute("uname"));
		writer.println("<br>");
		writer.println("User age = "+session.getAttribute("uage"));
		writer.println("<br>");
		writer.println("User qualification = "+session.getAttribute("uqual"));
		writer.println("<br>");
		writer.println("User designation = "+session.getAttribute("udes"));
		writer.println("<br>");
		writer.println("User email id = "+request.getParameter("email"));
		writer.println("<br>");
		writer.println("User mobile = "+request.getParameter("mobile"));
		
	
	}

}
