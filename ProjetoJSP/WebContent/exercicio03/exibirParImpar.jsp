<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Par ou �mpar?</title>
</head>
<body>

	<label> <b> Verifique se o n�mero � par ou �mpar :) </b> </label>

	<br>
	<br>

<%

	int numero = Integer.parseInt(request.getParameter("numero"));

	if (numero % 2 == 0) {
		out.print("O n�mero " + numero + " � " + "<b>PAR!</b>");
		out.print("<br>");
	} else {
		out.print("O n�mero " + numero + " � " + "<b>�MPAR!</b>");
		out.print("<br>");
		
	}
		
%>


</body>
</html>