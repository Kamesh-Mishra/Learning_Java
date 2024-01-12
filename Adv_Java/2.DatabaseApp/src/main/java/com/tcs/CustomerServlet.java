package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


public class CustomerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public CustomerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		String firstname = request.getParameter("firstname");
		String lastname  = request.getParameter("lastname");
		
		String email = request.getParameter("email");
		String mobile = request.getParameter("mobile");
		
		String[] addr = request.getParameterValues("t1");
		
		StringBuffer buffer = new StringBuffer();
		
		for(String s: addr) {
			buffer.append(s+", ");
		}
		String caddr = buffer.toString();
		
		try {
			
//			Class.forName("org.sqlite.JDBC");
			
//			Connection con = DriverManager.getConnection("jdbc:sqlite:C://Users//USER//sqlite//Customer.db");
			
			
			
			Context initContext = new InitialContext();
			
			DataSource ds = (DataSource)initContext.lookup("java:/comp/env/mypool");
			
			Connection con = ds.getConnection();
			
			
			
			
			
			PreparedStatement stm = con.prepareStatement("insert into customer values(?,?,?,?,?)");
			
			stm.setString(1, firstname);
			stm.setString(2, lastname);
			stm.setString(3, email);
			stm.setString(4, mobile);
			stm.setString(5, caddr);
			
			int a = stm.executeUpdate();
			if(a==1) {
				writer.println("Data is inserted successfully....<br><br>");
				writer.println("<a href='./DisplayServlet' > Click here to Display all records.</a>");
				
			}
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
