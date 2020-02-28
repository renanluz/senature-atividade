<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="pt-br">
<head>
<meta charset="UTF-8" />
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">
<title>Busca de Vagas</title>
</head>
<body>
	<form action="vaga" method="get">
		<input type="text" placeholder="Nome" name="nome">
		<input type="submit" value="Buscar">
	</form>
	
	<h2>Resultados</h2>
	<ul>
		<c:forEach items="${resultado }" var="v">
		<li>${v.descricao }</li>
		</c:forEach>
	</ul>
	
</body>
</html>