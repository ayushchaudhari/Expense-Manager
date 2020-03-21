<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>SignUp Page</title>
</head>
<p><h1>Registration Page</h1></p>
<body>
<form>
<tr>
	<td>Username:</td>
	<td><input type="text" name="username"></form>
</tr>	
<br>
	<td>Name</td>
	<td><input type="text" name="name"></form>
</br>	
<br>
	<td>Password:</td>
	<td><input type="password" name="password"></form>
</br>	
<br>
	<td>Re-type Password:</td>
	<td><input type="password" name="re-type password"></form>
</br>	
<br><input type="submit" value="register" form="warning"> </br>
<br>back to login page</br><tr><td><a href="index.jsp">login page</a></td></tr>
<p> current date:<%=new java.util.Date() %></p>
</body>
</html>