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

</style>

</head>

</head>
<body>
<h1>Welcome to Spring MVC</h1>

<h4 style="color:green">${successMsg}</h4>
<h4 style="color:red">${errorMsg }</h4>

<form action="updateForm">

    
	<input type="text" name="name" placeholder="Enter User Name"><br><br><br>
	<input type="email" name="emailId" placeholder="Enter Email "><br><br><br>
	<input type="text" name="mobile" placeholder="Enter MObile "><br><br><br>
	<textarea rows="" cols="" name="address" placeholder="Enter Address Here"></textarea>
	<input type="text" name="city" placeholder="Enter City Name "><br><br><br>
	<input type="text" name="state" placeholder="Enter State "><br><br><br>
	
	<input type="submit" value="Update studentBio">

</form>



</body>
</html>