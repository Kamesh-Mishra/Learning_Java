package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;


public class DisplayServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DisplayServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		try {
			
//			Class.forName("org.sqlite.JDBC");
//			Connection con = DriverManager.getConnection("jdbc:sqlite:C://Users//USER//sqlite//Customer.db");
			
//			Connection con = ConnUtils.dataSource.getConnection();
			
			
			
			
			
			Context initContext = new InitialContext();
			
			DataSource ds = (DataSource)initContext.lookup("java:/comp/env/mypool");
			
			Connection con = ds.getConnection();
			
			
			
			
			
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery("select * from customer");
			
			writer.println("<b>FirstName		LastName	 Email	 Mobile	 Address</b><br>");
			while(rs.next()) {
				writer.println(rs.getString(1) +"	"+ rs.getString(2) +"	"+ rs.getString(3) +"	"+ 
						rs.getString(4) +"	"+ rs.getString(5));
				writer.println("<br><br>");
			}
			writer.println("<a href='customer.html' >Click here to Add Records.<a>");
			
		} catch (Exception e) {
			System.out.println(e);
		}
		
		
		
	}

}
