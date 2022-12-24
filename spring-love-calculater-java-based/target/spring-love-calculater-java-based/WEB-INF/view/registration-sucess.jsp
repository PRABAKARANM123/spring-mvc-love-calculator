<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registration Successful</h1>
<h2>The details entered you are : </h2>
	Name : ${userReg.name}<br>
	User Name : ${userReg.userName}<br>
	Password : ${userReg.password}<br>
	Country Name : ${userReg.countryName}<br> Hobbies :
	 
	<c:fo
	<br>
	Gender : ${userReg.gender}<br>
	
</body>
</html>