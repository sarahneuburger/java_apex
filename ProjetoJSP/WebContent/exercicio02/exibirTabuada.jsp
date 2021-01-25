<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tabuada</title>
</head>
<body>

	<label> <b> Veja a tabuada do número informado :) </b> </label>

	<br>
	<br>

<%

	int tabuada = Integer.parseInt(request.getParameter("tabuada"));

	for(int i = 1; i < 11; i++) {
		out.print(tabuada * i);
		out.print("<br>");
	}
		
%>


</body>
</html>