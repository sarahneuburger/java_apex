<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Média e Situação</title>
</head>
<body>

	<label> <b> Média e Situação do Aluno </b> </label>

	<br>
	<br>

<%

	int nota1 = Integer.parseInt(request.getParameter("nota1"));

	int nota2 = Integer.parseInt(request.getParameter("nota2"));
	
	int nota3 = Integer.parseInt(request.getParameter("nota3"));
	
	int media = (nota1 + nota2 + nota3) / 3;
	
	
	if(media >= 7) {
		out.print("A média do aluno é: " + media + ".");
		out.print("<br>");
		out.print("A situação do aluno é: " + "<b>APROVADO</b>" + ".");
	} else if (media >= 5) {
		out.print("A média do aluno é: " + media + ".");
		out.print("<br>");
		out.print("A situação do aluno é: " + "<b>EM EXAME</b>" + ".");		
	} else if (media < 5) {
		out.print("A média do aluno é: " + media + ".");
		out.print("<br>");
		out.print("A situação do aluno é: " + "<b>REPROVADO</b>" + ".");

	}	
		
%>

	


</body>
</html>