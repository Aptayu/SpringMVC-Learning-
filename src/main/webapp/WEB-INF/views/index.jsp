<html>
<body>
<h2>Hello World!</h2>
<h3>Hi</h3>

<%
	String s = (String)request.getAttribute("name");

%>

<p><%= s %> yes</p>
</body>
</html>
