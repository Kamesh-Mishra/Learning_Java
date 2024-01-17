package com.tcs;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class MyFilter1 implements Filter {

    
    public MyFilter1() {
       
    }

	
	public void destroy() {
		}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		int age = Integer.parseInt(request.getParameter("uage"));
		
		if(age>20)
		{
			//pass the filter along the filter chain
			chain.doFilter(request, response);
		}
		else {
			writer.println("u r not eligible for mrg ur age is below 20");
			request.getRequestDispatcher("form.html").include(request, response);
		}
	
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
	
	}

}
