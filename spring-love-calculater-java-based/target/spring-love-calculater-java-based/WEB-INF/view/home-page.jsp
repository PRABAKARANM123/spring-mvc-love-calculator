<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomePage</title>

<script type="text/javascript">
function validateUserName() {
	var userName = document.getElementById('yn').value;
	if(userName.length<1){
		alert("your name should have atleast one char");
	return true;
	}
	
}

</script>

</head>
<body>
	<h1 align="center">Love Calculator</h1>
	<hr/>
	<form:form action="proces-homepage" method="get" modelAttribute="userInfo">
	<div align="center">
	<p>
	<label for="yn">Your Name</label>
	<form:input id="yn" path="userName"/>
	<form:errors path="userName"></form:errors>
	</p>
	<p>
	<label for="cn" >Crush Name</label>
	<form:input  id="cn" path="crushName"/>
	</p>
	<input type="submit" value="calculate">
	</div>
	</form:form>
</body>
</html>