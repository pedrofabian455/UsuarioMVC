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
        <title>Datos</title>
    </head>
    <body>
        <h1>Datos usuarios</h1>
        <form>
            label Nombre: <%=request.getAttribute("nombre") %>
            <br>
            label Email: <%=request.getAttribute("email") %>
        </form>
    </body>
</html>
