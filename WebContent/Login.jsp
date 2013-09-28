<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="StyleSheet.css" rel="stylesheet" type="text/css"/>
<title>BargeBQ Login Page</title>
</head>
<body>
<!-- Add a controller form and make sure it doesn't default to get -->
<form action ="Login" method="post">
	<br><p id="lg"> User ID:&nbsp;  <input type="text" name="userId"/>
	<br><p id="lg"> Password:&nbsp; <input type="password" name="password"/>
	<br><p id="lg"> Special:&nbsp;  <input type="text" name="special"/>
	<br><input type="submit" name="submit"/>
</form>

</body>
</html>