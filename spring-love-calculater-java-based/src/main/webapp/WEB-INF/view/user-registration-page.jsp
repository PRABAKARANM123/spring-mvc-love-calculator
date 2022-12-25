<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 align="center">Please Register Here</h1>
	<form:form action="registration-sucess" method="GET" modelAttribute="userRege">
	<div align="center">
	<label>User : </label>
	<form:input path="name"/>
	<br>
	
	<label>User Name : </label>
	<form:input path="userName"/>
	<br>
	
	<label>Password : </label>
	<form:password path="password"/>
	<br>
	
	<label>Country : </label>
	<form:select path="countryName">
	<form:option value="ind" label="India"></form:option>
			<form:option value="ind" label="India"></form:option>

			<form:option value="pak" label="Pakisthan"></form:option>

			<form:option value="usa" label="United States"></form:option>

			<form:option value="sl" label="SriLanka"></form:option>
	</form:select>
	<br>
	
	<label>Hobbies : </label>
		Cricket : <form:checkbox path="hobbies" value="Cricket"/>
		Reading : <form:checkbox path="hobbies" value="Reading"/>
		Travel : <form:checkbox path="hobbies" value="Travel"/>
		Music : <form:checkbox path="hobbies" value="Music"/>
		Programming : <form:checkbox path="hobbies" value="Programming"/>
		<br>
		
	<label>Gender : </label>
		Male : <form:radiobutton path="gender" value="male"/>
		Female : <form:radiobutton path="gender" value="female"/>
		<br/>
		</div>		
		
		<div align="center">
		<h3>Communication</h3>
		<label>Email</label>
		<form:input path="communicationDTO.email"/>
		<label>Phone</label>
		<form:input path="communicationDTO.phone"/>
		<br/>
			
	<input type="submit" value="register">
	
	</div> 
	
	
	
	</form:form>
</body>
</html>