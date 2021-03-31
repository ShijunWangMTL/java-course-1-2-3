<html>
<head>
<title>Student Confirmation</title>
</head>

<body>
The student is confirmed: ${param.firstName} ${param.lastName}
<br/>
<!--  display the list of "favoriteLanguage" -->
<ul>
<%
	String[] langs = request.getParameterValues("favoriteLanguage");
	if(langs != null){
		for(String langsTemp : langs){
			out.print("<li>" + langsTemp + "</li>");
		}
	}
%>
</ul>
</body>
</html>