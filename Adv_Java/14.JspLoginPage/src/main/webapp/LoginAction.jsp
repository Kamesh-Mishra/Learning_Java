<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>LoginAction</title>
</head>
<body>

<%-- this is declaration --%>
<%!
	String username;
	String password;
%>

<!-- This is block of java code : scriptlet -->
<%
	username = request.getParameter("username");
	password = request.getParameter("password");

	
	if(username.equalsIgnoreCase("ratan") && password.equalsIgnoreCase("anu"))
	{
		//out.println("Login Successfull...."+ username);
		response.sendRedirect("http://www.google.com");
	}
	else
	{
		//out.println("login fail try with valid data ....."+username);
		response.sendError(777, "Login fail try with valid username and password");
	}
%>

<%--print the variables : expressions --%>
<br><br>
User name : <%=username %> <br>
Password  : <%=password %>


</body>
</html>