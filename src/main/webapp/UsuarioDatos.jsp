<%-- 
    Document   : UsuarioDatos
    Created on : 19 abr. 2023, 21:45:00
    Author     : Fabian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="assets/css/usuariodatos.css"/>
        <title>Datos</title>
    </head>
    <body>
        <h1>Datos usuarios</h1>
        <form>
            <label>Nombre: </label> <%=request.getAttribute("nombre") %>
            <br><br>
           <label> Email: </label> <%=request.getAttribute("email") %>
        </form>
    </body>
</html>
