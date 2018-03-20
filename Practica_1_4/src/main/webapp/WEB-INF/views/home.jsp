<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario</title>
</head>
<body>
<h1>Control de acceso</h1>
<form action="http://localhost:8080/proyectoMVC/Sesion3" method=post>
Usuario:<input type="text" name="usuario"> Password:<input type="password" name="clave">
<br>
<br>
<input type=submit value=Enviar>
</form>
</body>
</html>