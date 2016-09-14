<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <script language="JavaScript">
    function showInput() {
        document.getElementById('Submit').innerHTML =document.getElementById("user_input").value;
    }
  </script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Contact us</title>
</head>

<body>
<%@include file ="Header.jsp" %>
<br>

<div class="c1">
<tr>
<td>
First Name<input type="text" ><br>
Last Name<input type="text" ><br>
Email Id<input type="text" ><br>
Number<input type="text" ><br>
<button onclick="myFunction()">Submit</button>
</td>
</tr>
</div>

<script>
function myFunction() {
    alert("We will contact u shorlty!!!");
}

</script>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<br>
<%@include file="footer.jsp" %>
</body>
</html>