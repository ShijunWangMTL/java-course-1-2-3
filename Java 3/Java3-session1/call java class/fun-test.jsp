<%@page import="com.ja.jsp.FunUtils, java.util.*"%>
<html>
<body>

Let's have fun today with JSP <%= com.ja.jsp.FunUtils.makeItLower("FUN FUN FUN") %>
<br/>
Let's have fun today with JSP <%= FunUtils.makeItLower("FUN FUN FUN") %>

</body>
</html>