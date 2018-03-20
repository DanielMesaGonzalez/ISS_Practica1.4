<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="st" %>
<!-- libreria jstl-1.2.jar situar dentro de lib https://stackoverflow.com/tags/jstl/info -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Tabla de usuarios</title>
</head>
<body>
<table>
<tr style="background:#BDBDBD">
<th> Apellidos </th>
<th> Nombre </th>
<th> email </th>
</tr>
<st:forEach items="${usuarios}" var="user" varStatus="estado">
<st:if test="${estado.count%2 == 0}">
<tr style="background:#81BEF7">
</st:if>
<st:if test="${estado.count%2 != 0}">
<tr style="background:#01A9DB">
</st:if>
<td><st:out value="${user.apellidos}" /></td>
<td><st:out value="${user.nombre}" /></td>
<td><st:out value="${user.email}" /></td>
</tr>
</st:forEach> </table>
</body>
</html>