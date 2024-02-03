package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 2 request        4 cookies    are stored in request
		
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		
		Cookie[] cookies = request.getCookies();
		
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		
		writer.println("<html>");
		writer.println("<body bgcolor='pink'>");
		writer.println("<center><h1>");
		writer.println("<br><br>");
		
		writer.println("User Name : "+ cookies[0].getValue() + "<br><br>");
		writer.println("User Age  : "+ cookies[1].getValue() + "<br><br>");
		writer.println("Qualification : "+ cookies[2].getValue() + "<br><br>");
		writer.println("Designation : "+ cookies[3].getValue() + "<br><br>");
		
		writer.println("Email : "+ email + "<br><br>");
		writer.println("Mobile : " + mobile + "<br><br>");
		
		writer.println("</h1></center>");
		writer.println("</body>");
		writer.println("</html>");
		
		
	}

}
