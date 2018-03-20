<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="st" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Sesion</title>
</head>
<body>
Nombre:<st:out value="${nusuario.nombre}"/>
Apellidos:<st:out value='${nusuario.apellidos}'/>
Email:<st:out value="${nusuario.email}"/>
</body>
</html>