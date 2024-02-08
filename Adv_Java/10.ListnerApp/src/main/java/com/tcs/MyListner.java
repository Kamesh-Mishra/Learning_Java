package com.tcs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;


public class MyListner implements ServletContextListener {

    public MyListner() {
        
    }

    public void contextDestroyed(ServletContextEvent sce)  { 
         
    	System.out.println("contextDestroyed method Connection closed");
    	ServletContext context = sce.getServletContext();
    	Connection connection = (Connection) context.getAttribute("conn");
    	try {
			connection.close();
		} catch (SQLException e) {
			System.out.println(e);
		}
    	 
    }

    public void contextInitialized(ServletContextEvent sce)  { 
         System.out.println("contextInitialized method Connection creation");
         
         try {
        	 Class.forName("org.sqlite.JDBC");
        	 Connection con = DriverManager.getConnection("jdbc:sqlite:C://Users//USER//sqlite//Customer.db");
 			
// 			Connection con = ConnUtils.dataSource.getConnection();
        	 
 			ServletContext context = sce.getServletContext();
 			context.setAttribute("con", con);
 			
         }
         catch(Exception e){
        	 System.out.println(e);
         }
        	 
         
         
    }
	
}
