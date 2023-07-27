<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">

	input,textarea{
	
		display: block;
		margin-bottom: 5px;
	
	}
</head>
</style>
<body>
<h1>Welcome to Spring MVC</h1>

<h4 style="color:green">${successMsg }</h4>
<h4 style="color:red">${errorMsg }</h4>

<h1>DELETE FORM</h1>
<form action ="deleteForm" method="post">
<input type="text" name="id" placeholder="Enter Id"><br><br><br>
    <input type="submit" value="Select student"><br><br><br>
</form>

</body>
</html>