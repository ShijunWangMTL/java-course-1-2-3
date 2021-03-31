<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Management App</title>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/CSS/style.css">
</head>
<body>
	<div id="container">
		<h1>Book Management App</h1>

		<form class="center" action="showResult" method="GET">

			Search by: <input type="radio" name="searchBy" value="name" checked/>Book
			name &nbsp;&nbsp; <input type="radio" name="searchBy" value="author" />Author
			&nbsp;&nbsp; <input type="radio" name="searchBy" value="publisher" />Publisher

			<br>
			<br> 
			
			<input class="search-console" type="text" name="keyword" /> 
			<input class="form-btn" type="submit" value="Search" />

		</form>
		<br>
		<br> 
		<a href="./">Return to Menu</a>
	</div>

</body>
</html>