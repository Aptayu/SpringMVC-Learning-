<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.time.LocalDateTime" %>

<!--To get the JSTL enabled  -->
<%@page isELIgnored="false" %>    

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String name = (String) request.getAttribute("name");
	LocalDateTime time = (LocalDateTime) request.getAttribute("timeNow");
	%>
	<h1>
		Hi again
		<%=name%>
		you are logged in at
		<%=time.toString()%>
	</h1>
	<!-- Lets Write JSTL goot approach-->
	${name}
	<hr>
	<!--How would you traverse a list using JSTL, you need
	to have a dependency of it -->
	<c:forEach var="item" items="${marks} }">
		<h1>{item}</h1>
	
	</c:forEach>

</body>
</html>