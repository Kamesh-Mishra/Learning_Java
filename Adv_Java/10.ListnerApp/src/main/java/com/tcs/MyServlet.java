package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public MyServlet() {
        super();
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		String tname = request.getParameter("tname");
		
		ServletContext context = request.getServletContext();
		Connection connection = (Connection) context.getAttribute("con");
		
		try {
			Statement statement = connection.createStatement();
			ResultSet set = statement.executeQuery("select * from " + tname );		// customer table
			
			
			writer.println("<b>FirstName		LastName	 Email	 Mobile	 Address</b><br>");
			while(set.next()) {
				writer.println(set.getString(1) +"	"+ set.getString(2) +"	"+ set.getString(3) +"	"+ 
						set.getString(4) +"	"+ set.getString(5));
				writer.println("<br><br>");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
	}

	
	
}
