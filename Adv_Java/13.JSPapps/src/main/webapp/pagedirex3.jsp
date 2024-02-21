<%@ page language="java" contentType="text/html" autoFlush="false" errorPage="myerror.jsp" buffer="1kb"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% 
	for(int i=0; i<100000; i++)
	{
		out.println(" JSP Classes ");
	}
%>

</body>
</html>