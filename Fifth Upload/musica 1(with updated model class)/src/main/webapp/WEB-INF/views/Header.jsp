<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>MUSICA</title>
<link rel="stylesheet" type="text/css" href="style.css"/>
<link rel="stylesheet" href="<c:url value =" /http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />"/>


<!-- Latest compiled JavaScript -->
<script src="<c:url value ="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"/>"></script>

<!-- jQuery library -->
<script src="<c:url value ="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"/>"></script>

</head>
<body>

<h2 align="center">MUSICA</h2>
<hr width='100' color='blue'/>
<!-- for navigation bar in bootstrap -->
<div class="container" id="main">
<div class="navbar navbar-fixed-top">
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
<span class="icon-bar"></span>
<span class="icon-bar"></span>
<span class="icon-bar"></span>
</button>
<a class="navbar-brand" href="index">MUSICA</a>
</div>
<div class="collapse navbar-collapse" id="myNavbar">
    <ul class="nav navbar-nav">
      <li class="active"><a href="index">Home</a></li>
       <li class="dropdown">

      <li><a href="AboutUs">AboutUs</a></li>
      <li><a href="AllProducts">AllProducts</a></li>
      <li><a href="ContactUs">Contact Us</a></li>
      
    </ul>
    <ul class="nav navbar-nav navbar-right">
      <li><a href="Register"><span class="glyphicon glyphicon-user"></span> Register </a></li>
      <li><a href="Login"><span class="glyphicon glyphicon-log-in"></span> Login </a></li>
    </ul>
  </div>
</nav>
</div><!-- navbar fixed top -->
</div><!-- end container -->

</body>
</html>