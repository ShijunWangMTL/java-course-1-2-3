<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<html>
<body>
<c:set var="data" value="johnabbott" />

Length of the string <b>${data}</b>: ${fn:length(data)}

<br/><br/>

The upper case version of the string <b>${data}</b>: ${fn:toUpperCase(data)}

<br/><br/>

Does the string <b>${data}</b> starts with <b>john</b>? ${fn:startsWith(data,"john")}

<br/><br/>

Does the string <b>${data}</b> starts with <b>johns</b>? ${fn:startsWith(data,"johns")}
</body>
</html>