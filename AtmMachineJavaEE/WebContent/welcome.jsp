<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
Access Granted!
<br>
<strong>User's name is :</strong> ${user} 
<br>
<strong>User account balance is :</strong> ${user.account.balance}<br>



<br><a href="LaunchApplicationController?action=addMoney">Add money.</a>
<br><br><a href="LaunchApplicationController?action=withdrawMoney">Withdraw money.</a>





</body>
</html>