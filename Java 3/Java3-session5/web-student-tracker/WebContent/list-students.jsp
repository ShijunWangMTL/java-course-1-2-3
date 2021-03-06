<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<title> Student Tracker App </title>
	<link type="text/css" rel="stylesheet" href="CSS/style.css">
</head>

<body>
	<div id="wrapper">
		<div id="header">
			<h2>Ecole Polytechnique</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
				</tr>
				
				<c:forEach var="tempStudent" items="${STUDENT_LIST}">
				<tr>
					<td>${tempStudent.firstName}</td>
					<td>${tempStudent.lastName}</td>
					<td>${tempStudent.email}</td>
				</tr>
				</c:forEach>						
			</table>
		</div>
	</div>


</body>
</html>