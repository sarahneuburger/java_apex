<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dados</title>
</head>
<body>

<%

	// pegando os dados preenchidos na tela formul�rio e printando
	String nome = request.getParameter("nome");

	int idade = Integer.parseInt(request.getParameter("idade"));
	
	out.print("O nome informado �: " + nome);
	out.print("<br>");
	out.print("A idade informada �: " + idade);


%>

</body>
</html>