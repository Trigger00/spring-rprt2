<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Alumnos</title>
</head>
<body>
	<h1>Alumnos</h1>

	<hr />

	<table>
		<tr>
			<th>Matricula</th>
			<th>Programa</th>
			<th>Acciones</th>
		</tr>

		<c:forEach var="i" items="${alumnos}">
			<tr>
				<th>${i.matricula}</th>

				
			
				
				
			


			</tr>
		</c:forEach>
	</table>
</body>
</html>