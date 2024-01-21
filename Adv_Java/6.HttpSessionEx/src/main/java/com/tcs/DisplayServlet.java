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

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		
		HttpSession session = request.getSession(false);
		
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		
		writer.println("<html>");
		writer.println("<body bgcolor='blue'>");
		writer.println("<center><h1>");
		writer.println("<br><br>");
		
		writer.println("User Name : "+ session.getAttribute("uname")+ "<br><br>");
		writer.println("User Age  : "+ session.getAttribute("uage")+ "<br><br>");
		writer.println("Qualification : "+ session.getAttribute("uqual")+ "<br><br>");
		writer.println("Designation : "+ session.getAttribute("udesig")+ "<br><br>");
		
		writer.println("Email : "+ email + "<br><br>");
		writer.println("Mobile : " + mobile + "<br><br>");
		
		writer.println("</h1></center>");
		writer.println("</body>");
		writer.println("</html>");
	}

}
