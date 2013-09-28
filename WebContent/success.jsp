<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Success</title>
</head>
<body>
<%-- <jsp:forward page=""></jsp:forward> --%>
<h1>Login Successful! </h1>

<jsp:useBean id="user" class="com.bargebq.Apps.dto.User" scope="request">
	<jsp:setProperty property="userName" name="user" value="NewUser"/>
	<jsp:setProperty property="special" name="user"/>
	<jsp:setProperty property="userId" name="user"/>
</jsp:useBean>

<!--Hello <%=user.getUserName()%> your authentication was successful!-->

Hello <jsp:getProperty property="userName" name="user"/>
<br>
Special <jsp:getProperty property="special" name="user"/>
<br>
UserID <jsp:getProperty property="userId" name="user"/>

<%
      
	if( request.getParameter("userId").equals("Larry") && request.getParameter("password").equals("Guy123")){		
		response.sendRedirect("AdminPage.jsp");
	}
	else if (request.getParameter("userId").equals("Katie") && request.getParameter("password").equals("Lady123")){
		response.sendRedirect("Menu.jsp");		
	}
	else
	{  
		response.sendRedirect("Login.jsp");
	}
	
%>

</body>
</html>