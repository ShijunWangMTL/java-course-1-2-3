<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book Management App</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/CSS/style.css">
</head>
<body>
	<div id="container">
		<h1>Book Management App</h1>
		<h2>The book is confirmed.</h2>
		<table class="confirm">
			<tr>
				<td>Book ID</td>
				<td>${book.id}</td>
			</tr>
			<tr>
				<td>Book Name</td>
				<td>${book.name}</td>
			</tr>
			<tr>
				<td>Author</td>
				<td>${book.author}</td>
			</tr>
			<tr>
				<td>Publisher</td>
				<td>${book.publisher}</td>
			</tr>
			<tr>
				<td>Publish Date</td>
				<td>${book.date}</td>
			</tr>
			</table>

			<br>
			<br>
			<a href="./">Return to Menu</a>
	</div>
</body>
</html>