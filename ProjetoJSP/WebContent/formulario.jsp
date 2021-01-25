<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cadastro</title>
</head>
<body>

	<form action="receber.jsp" method="post">
	<!-- method post para bloquear que os dados sejam exibidos na url -->
	<!-- action "receber" está linkando outra página -->
	
		<label>Nome: </label>
		
		<input type="text" name="nome">
		
		<br>
		<br>
	
		<label>Idade: </label>
		
		<input type="text" name="idade">
	
		<br>
		<br>
	
		<!-- botão submit para pegar os dados que foram digitados nos campos acima -->
		<input type="submit" value="Clique aqui">		
	
	
	</form>


</body>
</html>