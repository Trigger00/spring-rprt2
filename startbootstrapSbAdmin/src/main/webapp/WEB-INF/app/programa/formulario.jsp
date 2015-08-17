<%-- 
    Document   : formulario
    Created on : 10/01/2015, 12:10:13 PM
    Author     : PCC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Programa</h1>

        <form method="post" action="<%=request.getContextPath()%>/programa/guardar">
          <input type="hidden" name="id" value="${programa.id}"/> 

            <br/>
            <br/>
            <label> Nombre </label>
            <input type="text" name="nombre" value="${programa.nombre}" />
            <br/>
            <br/>
           <label> Descripción </label>
            <input type="text" name="descripcion" value="${programa.descripcion}" />
            <br/> 
            <br/>
            <label> Código </label>
            <input type="text" name="codigo" value="${programa.codigo}"/>
            <br/>
            <br/>
            <input type="submit" value="Guardar" class="btn"/>
        </form>
    </body>
</html>
