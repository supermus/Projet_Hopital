<%@ page language="java" contentType="text/html; charset=windows-1256"
    pageEncoding="windows-1256"%>
    
    <%@ taglib prefix="s" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=windows-1256">
<title>Login</title>
</head>
<body>
	<s:form method = "post" commandName="acc" action="account/login.html">
		<table cellpadding="2" cellspacing="2">
			<tr>
				<td>Login</td>
				<td><s:input path="login"/></td>
			</tr>
			
		<tr>
			<td>Mdp</td>
			<td><s:input path="mdp"/></td>
		</tr>
		<tr>
			<td>&nbsp;</td>
			<td><input type="submit" value="Login"></td>
		</tr>
		</table>
	</s:form>
</body>
</html>