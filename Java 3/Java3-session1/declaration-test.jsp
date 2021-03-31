<html>
<body>

<%!

String makeItLower(String data){
	return data.toLowerCase();
}

%>
The lower case for "Hello World" is: <%= makeItLower("Hello World") %>

</body>
</html>