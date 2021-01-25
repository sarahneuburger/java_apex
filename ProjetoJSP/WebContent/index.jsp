<%@page import="java.time.LocalDateTime"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Minha página JSP</title>
</head>
<body>

	Aprendendo JSP na APEX!
	
	<%
	
		LocalDateTime objeto = LocalDateTime.now();
	
		// <br> é código do script para quebrar linha 
		out.print("<br>");
	
		out.print(objeto);
	
	
		int a = 10;
		int b = 30;
		
		out.print("<br>");
		
		out.print(a + b);
		
	%>


</body>
</html>