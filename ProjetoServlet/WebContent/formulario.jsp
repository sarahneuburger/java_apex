<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Exibir dados</title>
</head>
<body>


	<form action="exibir" method="post">

	
		<label> <b> Informe os dados para exibir: </b> </label>
		
		<br>
		<br>
		
		<label>Nome: </label>
		<input type="text" name="nome">
		
		<br>
		<br>
	
		<label>Idade: </label>
		<input type="text" name="idade">
	
		<br>
		<br>
	
		<input type="submit" value="Exibir">		
	
	
	</form>


</body>
</html>