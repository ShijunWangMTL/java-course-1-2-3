<html>

<body>
<!--  read the favorite programming language cookie -->
<%
	// by default, if there are no cookies
	String favLang = "Java";

	// get the cookies from the browser request
	Cookie[] theCookies = request.getCookies();
	
	// find our favorite language cookie
	if(theCookies != null){
		for(Cookie tempCookie : theCookies){
			if("myApp.favoriteLanguage".equals(tempCookie.getName())){
				favLang = tempCookie.getValue();
				break;
			}
		}
	}
%>

<!--  show a personlized page, use the "favLang" variable -->

<!--  show new books for this lang -->
<h4>New Books for <%= favLang %></h4>
<ul>
	<li>bla bla bla</li>
	<li>bla bla bla</li>
	<li>bla bla bla</li>
</ul>

<!--  show new reports for this lang -->
<h4>New Reports for <%= favLang %></h4>
<ul>
	<li>bla bla bla</li>
	<li>bla bla bla</li>
	<li>bla bla bla</li>
</ul>

<!--  show new hot jobs for this lang -->
<h4>New hot jobs for <%= favLang %></h4>
<ul>
	<li>bla bla bla</li>
	<li>bla bla bla</li>
	<li>bla bla bla</li>
</ul>

<hr>
<a href="cookies-personalize-form.html">Personalize this page</a>

</body>

</html>