<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan">

<!-- request is an implicit object and is giving to us as default -->
	<!-- delimeter is used to specify java code in jsp -->
	
	<% 
		int i = Integer.parseInt(request.getParameter("num1"));
		
		int j = Integer.parseInt(request.getParameter("num2"));
		
		int k = i + j;
		
		out.println("Output : " + k);
		
		%>

</body>
</html>