<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>M�dia e Situa��o</title>
</head>
<body>

	<label> <b> M�dia e Situa��o do Aluno </b> </label>

	<br>
	<br>

<%

	int nota1 = Integer.parseInt(request.getParameter("nota1"));

	int nota2 = Integer.parseInt(request.getParameter("nota2"));
	
	int nota3 = Integer.parseInt(request.getParameter("nota3"));
	
	int media = (nota1 + nota2 + nota3) / 3;
	
	
	if(media >= 7) {
		out.print("A m�dia do aluno �: " + media + ".");
		out.print("<br>");
		out.print("A situa��o do aluno �: " + "<b>APROVADO</b>" + ".");
	} else if (media >= 5) {
		out.print("A m�dia do aluno �: " + media + ".");
		out.print("<br>");
		out.print("A situa��o do aluno �: " + "<b>EM EXAME</b>" + ".");		
	} else if (media < 5) {
		out.print("A m�dia do aluno �: " + media + ".");
		out.print("<br>");
		out.print("A situa��o do aluno �: " + "<b>REPROVADO</b>" + ".");

	}	
		
%>

	


</body>
</html>