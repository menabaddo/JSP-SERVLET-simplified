<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
    <%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	101 <br>
	Alexander <br>
	102 <br>
	
	<br>
	
	<%
	String url = "jdbc:mysql://localhost:3306/test_jsp";
	String username = "root";
	String password ="";
	String sql = "select * from test_table";
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection(url,username,password);
	Statement st = con.createStatement();
	
	ResultSet rs = st.executeQuery(sql);
	rs.next();
	
	
	
	
	%>
	<!-- expression displays the information directly to client 
	without specifying out.println meanwhile scriptlet will need you to specify out.println -->
	Name: <%= rs.getString(1) %><br>
	Date of Birth: <%= rs.getString(2) %><br>
	Address: <%= rs.getString(3) %><br>

</body>
</html>