<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
This is the registration page!!

<form action="RegisterServlet" method="post">

<b>Enter Username:     </b><input type="text" name="userName" />
<br>
<b>Enter Password:     </b><input type="password" name="password" />
<br>
<b>Enter EmailAddress: </b><input type="text" name="emailAddress" />
<br>
<input type="submit" value="Register" />


</form>
</body>
</html>