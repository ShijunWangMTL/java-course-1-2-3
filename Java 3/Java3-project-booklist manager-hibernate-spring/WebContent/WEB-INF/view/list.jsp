<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


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
	<h2>Book List</h2>
	<table class="list">
		<tr>
			<th>ID</th>
			<th>Book Name</th>
			<th>Author</th>
			<th>Publisher</th>
			<th>Publish Date</th>
			<th>Action</th>
		</tr>
		<c:forEach var="book" items="${books}">
			<tr>
				<td>${book.id}</td>
				<td>${book.name}</td>
				<td>${book.author}</td>
				<td>${book.publisher}</td>
				<td>${book.date}</td>
				<td><a href="edit?id=${book.id}">Edit</a> &nbsp;&nbsp; 
				<a href="delete?id=${book.id}">Delete</a></td>
			</tr>
		</c:forEach>

	</table>
	<br><br>
	<a href="./">Return to Menu</a>
	</div>
</body>
</html>