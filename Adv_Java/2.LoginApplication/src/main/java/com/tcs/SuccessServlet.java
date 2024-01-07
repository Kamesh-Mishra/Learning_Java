package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SuccessServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public SuccessServlet() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
				
		//general settings
				response.setContentType("text/html");
				PrintWriter writer = response.getWriter();
				
				writer.println("this is success servlet information....");
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
