<%-- add taglib for JSTL -- core tag and formatting tag --%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<%-- create and set theLocale --%>
<c:set var="theLocale" value="${not empty param.theLocale?param.theLocale:pageContext.request.locale }" scope="session" />
<fmt:setLocale value="${theLocale}" />
<fmt:setBundle basename="MidTermExamI18N.mylabels" />

<html>
<body>

<%--add links for language selection --%>
<a href="i18n-midtermexam-movieinfo.jsp?theLocale=en_US">English(US)</a>
|
<a href="i18n-midtermexam-movieinfo.jsp?theLocale=fr_CA">Français(CA)</a>
<hr>

<%-- page content --%>
<fmt:message key="label.movietitle"/>: <i><fmt:message key="label.theshawshankredemption"/></i>
<br/>
<fmt:message key="label.year"/>: <i>1994</i>
<br/>
<fmt:message key="label.director"/>: <i>Frank Darabont</i>
<br/>
<fmt:message key="label.country"/>: <i><fmt:message key="label.usa"/></i>
<br/>

<hr>
<fmt:message key="label.selectedlocale"/>: ${theLocale}

</body>
</html>