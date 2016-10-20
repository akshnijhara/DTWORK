<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<%@include file="Header.jsp" %>
<title>LOGIN PAGE</title>
<link rel="stylesheet" type="text/css" href="style.css"/>
</head>
<body>

<br>
<br>
<br>
<h1 align="center">LOGIN</h1>
<div class="container-wrapper">
<div class="container">
<div id="login-box">
<h2>Login with Username and Password</h2>
<c:if test="${not empty msg}">
<div class="msg">${msg}</div>
</c:if>
<!--j_spring_security_check"-->
<form name="loginForm" action="<c:url value="/j_spring_security_check"/>"method="post">
<c:if test="${not empty error}">
<div class="error"style="color: #ff0000;">${error}</div>
</c:if>
<div class="form-group">
<label for="username">User: </label>
<input type="text" id="username" name="username" class="form-control"/>
</div>
<div class="form-group">
<label for="password" >Password:</label>
<input type="password" id="password" name="password" class="form-control"/>
</div>
<input type="submit" value="Submit" class="btnbtn-default">
<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
</form>
</div>
</div>
</div>
	<%@include file="footer.jsp"%>

</body>
</html>