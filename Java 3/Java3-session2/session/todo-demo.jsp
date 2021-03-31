<!--  import to use List<String> -->
<%@ page import="java.util.*" %>  

<html>
<body>

<!-- step 1: create HTML form -->
<form action="todo-demo.jsp">
	Add new item: <input type="text" name="theItem" />
	<input type="submit" value="Submit" />
</form>

<!-- step 2: add new item to "TO DO" list -->
<%
// get the TO DO items from the session
List<String> items = (List<String>) session.getAttribute("myToDoList");

// if TO DO items doesn't exist, create a new one
if (items == null){
	items = new ArrayList<String>();
	session.setAttribute("myToDoList", items);
}

// see if there is form data to add
String theItem = request.getParameter("theItem");
if (theItem != null) {
	items.add(theItem);
}
%>

<!-- step 3: display all "TO DO" item from session -->
<hr>
<b>To Do List Items</b>
<ol>
<%
for(String temp : items){
	out.println("<li>" + temp + "</li>");
}
%>
</ol>

</body>
</html>