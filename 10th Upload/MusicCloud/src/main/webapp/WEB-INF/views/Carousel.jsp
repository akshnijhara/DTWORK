<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">

<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>

<!-- Latest compiled JavaScript -->
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
<br>
<br>
<br>
<div class="container">
<div id="Car" class="carousel slide" data-ride="carousel">
<ol class="carousel-indicators">
<li data-target="#Car" data-slide-to="0" class="active"></li>
<li data-target="#Car" data-slide-to="1"></li>
<li data-target="#Car" data-slide-to="2"></li>
</ol>
<div class="carousel-inner">
<div class="item active">
<img src="<c:url value ="/resources/images/1.jpg"/>" alt="Trumphet">
</div>
<div class="item">
<img src="<c:url value ="/resources/images/3.jpg"/>">
</div>
<div class="item">
<img src="<c:url value ="/resources/images/2.jpg"/>">
</div>
<a class="left carousel-control" href="#Car" role="button" data-slide="prev">
    <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
    <span class="sr-only">Previous</span>
  </a>
  <a class="right carousel-control" href="#Car" role="button" data-slide="next">
    <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
    <span class="sr-only">Next</span>
  </a>
</div>
</div>

</div>
</body>
</html>