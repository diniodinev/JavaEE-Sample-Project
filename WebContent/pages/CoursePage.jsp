<%@ page import="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="ver" tagdir="/WEB-INF/tags" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<ver:Header title="Web Services Course"/>
<table border="2">
	<thead>	
		<th>Title</th>
		<th>Date</th>
	</thead>
	<tbody>
		<tr>
			<td>Java Basics</td>
			<td><%= new Date() %></td>
		</tr>
		<tr>
			<td>Servlets and Pages</td>
			<td><%= new Date() %></td>
		</tr>
	</tbody>
</table>
	<ver:version/>
</body>
</html>