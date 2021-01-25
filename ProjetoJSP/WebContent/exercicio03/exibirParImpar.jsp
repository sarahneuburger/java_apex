<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Par ou Ímpar?</title>
</head>
<body>

	<label> <b> Verifique se o número é par ou ímpar :) </b> </label>

	<br>
	<br>

<%

	int numero = Integer.parseInt(request.getParameter("numero"));

	if (numero % 2 == 0) {
		out.print("O número " + numero + " é " + "<b>PAR!</b>");
		out.print("<br>");
	} else {
		out.print("O número " + numero + " é " + "<b>ÍMPAR!</b>");
		out.print("<br>");
		
	}
		
%>


</body>
</html>