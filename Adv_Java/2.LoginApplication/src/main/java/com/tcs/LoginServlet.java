package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//general settings
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		//get the requested data
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		
		//request processing logics
//		if(username.equalsIgnoreCase("ratan") && password.equals("anu"))
//		{
//			writer.println("Login Success..... " + username);
//		}
//		else
//		{
//			writer.println("Login fail.... try with valid data.......");
//		}
		
		
		

//		if(username.equalsIgnoreCase("ratan") && password.equals("anu")) {
//			response.sendRedirect("https://www.google.com"); } else {
//				response.sendError(808, "login fail try with valid data..."); }

		 
		
		
//		if(username.equalsIgnoreCase("ratan") && password.equals("anu"))
//			{
//				RequestDispatcher dispatcher = request.getRequestDispatcher("success.html");
//				dispatcher.forward(request, response);
//			}
//			else
//			{
//				RequestDispatcher dispatcher = request.getRequestDispatcher("fail.html");
//				dispatcher.forward(request, response);
//			}
		
		
		
		
//		if(username.equalsIgnoreCase("ratan") && password.equals("anu"))
//		{
//			writer.println("<a href='https://www.google.com'>Click here to get to the Google</a>");
//		}
//		else
//		{
//			writer.println("<a href='FailServlet'>Click here to  get the fail information....</a>");
//		}
		
		
		
		
		
		
		
		
		
		if(username.equalsIgnoreCase("ratan") && password.equals("anu"))
			{
				writer.println("this is success");
				writer.println("that is success");
				RequestDispatcher dispatcher = request.getRequestDispatcher("SuccessServlet");
				dispatcher.forward(request, response);												// forward
			}
			else
			{
				writer.println("this is fail <br> <br>");
				writer.println("that is fail <br> <br>");
				writer.println("please enter the valid details <br> <br>");
				RequestDispatcher dispatcher = request.getRequestDispatcher("fail.html");
				dispatcher.include(request, response);												// include
				writer.println("hi how are you !! <br> <br>");
			}
		
		
		
		
	}
	 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
