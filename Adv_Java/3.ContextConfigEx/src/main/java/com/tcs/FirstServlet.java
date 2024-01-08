package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FirstServlet
 */
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FirstServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		
		ServletConfig config = this.getServletConfig();
		writer.println("first servlet init param-1 : " + config.getInitParameter("HomeLoan"));
		writer.println("<br><br>");
		writer.println("first servlet init param-2 : " + config.getInitParameter("CarLoan"));
		writer.println("<br><br>");
		
		
		ServletContext context = request.getServletContext();
		writer.println("first servlet context param-1 : " + context.getInitParameter("username"));
		writer.println("<br><br>");
		writer.println("first servlet context param-2 : " + context.getInitParameter("password"));
		writer.println("<br><br>");

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
