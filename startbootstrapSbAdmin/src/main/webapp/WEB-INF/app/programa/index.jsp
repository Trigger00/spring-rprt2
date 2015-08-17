<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Programas</title>
    </head>
    <body>
        <h1>Programas</h1>
        <a href="programa/nuevo"> Nuevo</a>
        <hr/>

        <table>
            <tr>
                <th>Código</th>
                <th>Programa</th>
                <th>Acciones</th>
            </tr>

            <c:forEach var="i" items="${programas}">
                <tr>
                    <th>${i.id}</th>
                    <th>${i.nombre}</th>
                    <th>${i.descripcion}</th>
                    <th>${i.codigo}</th>
                    <th>
                        <a href="programa/${i.id}/editar"> Editar </a> &nbsp; 
                        <a href="programa/${i.id}/eliminar"> Eliminar </a> 
                        <a href="jrreport"> report </a> 

                    </th>
                </tr>
            </c:forEach>
        </table>
    </body>
</html>

