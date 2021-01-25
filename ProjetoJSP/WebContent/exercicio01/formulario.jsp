<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sistema de Notas</title>
</head>
<body>


	<form action="exibirNotas.jsp">

	
		<label> <b> Sistema de Notas </b> </label>
		
		<br>
		<br>
		
		<label> Informe as três notas do aluno: </label>
		
		<br>
		<br>
		
		<input type="number" name="nota1"
			min="0" max="10">
		
		<br>
		<br>
	
		<input type="number" name="nota2"
			min="0" max="10">
		
		<br>
		<br>
		
		<input type="number" name="nota3"
			min="0" max="10">
		
	
		<br>
		<br>
	
		<input type="submit" value="Clique para calcular a média">		
	
	
	</form>



</body>
</html>