<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

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
		<h2>Add a new book</h2>
		<form:form class="center" action="save" modelAttribute="book">
			<form:hidden path="id" />
			<table>
			<tr>
			<td>Book Name</td>
			<td><form:input path="name" /></td>
			</tr>
			<tr>
			<td>Author</td>
			<td><form:input path="author" /></td>
			</tr>
			<tr>
			<td>Publisher</td>
			<td><form:input path="publisher" /></td>
			</tr>
			<tr>
			<td>Publish Date</td>
			<td><form:input path="date" /></td>
			</tr>
			</table>
			
			<input class="form-btn" type="submit" value="Save" />
		</form:form>
		<br>
		<br> <a href="./">Return to Menu</a>
	</div>
</body>
</html>