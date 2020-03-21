<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Page</title>
</head>
<body>
<p><h1>WELCOME TO LOGIN PAGE</h1></p>
<form method="Post"and action="Login" /form>
<br>username :<input type="text" name="username" placeholder="username" ></br>
<br>password :<input type="password" name="password"  placeholder="password" ></br>
<br><input type="submit" value="Login" form="warning"> </br>
<tr><td><a href="homepage.jsp">SignUp</a></td></tr>
<p> current date:<%=new java.util.Date() %></p>
</body>
</html>