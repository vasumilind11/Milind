<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- <sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
                   url="jdbc:mysql://localhost/test1"
                   user="root" password="root"  scope="session" />

<sql:update  dataSource="${db}" var="count1">
DELETE FROM STUDENT WHERE ID= 4;
</sql:update>
<sql:query var="rs" dataSource="${db}">
SELECT* FROM STUDENT;
</sql:query>

<table border="2" width="100%">
<tr>
<th>ID</th>
	<th>First Name</th>
	<th>Last Name</th>
	<th>Age</th>
</tr>

<c:forEach var="table" items="${rs.rows}">
<tr>
	<td><c:out value="${table.id}"></c:out> 
	<td><c:out value="${table.First_name}"></c:out>
	<td><c:out value="${table.last_name}"></c:out>
	<td><c:out value="${table.Age}"></c:out>
</tr> 
</c:forEach>
</table>
<a href = "/NewFile.jsp">next</a>
 --%>
 <form action ="NewFile.jsp" method= "post" enctype="multipart/form-data">
 <input type="file" name="fname">
 <input type ="image" src ="C:\Users\milind\Desktop\pic.jpg"> 
 </form>
 
 
 
 </body>
</html>