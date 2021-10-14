<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="org.pack.com.*"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table border=1>
<tr>
<td>idno</td>
<td>Name</td>
<td>Mail</td>
<td>File name</td>
<td>Actions</td></tr>
<c:forEach var="e" items="${list}"> 
<tr>
<td>${e.id}</td>
<td>${e.name}</td>
<td>${e.mail}</td>
<td>${e.filename}</td>
<td><form action=Update method=post>
<button name=edit value=${e.id}>Edit</button>
</form>
 <form action=Delete method=post>
 <button name=id value=${e.id}>Delete</button>
 </form>
 </td>
</tr>
</c:forEach>
</table>
</body>
</html>