<%-- 
    Document   : usuario
    Created on : 19 abr. 2023, 21:19:01
    Author     : Fabian
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Usuario </title>
    </head>
    <body>
        <h1>Resgistro de Usuario </h1>
        <form action="<%=request.getContextPath() %>/UsuarioServlet" method="POST">
            <label> Nombre: <input type="text" name="nombre"</label>
                <br>
                <label> Email: <input type="email" name="email"</label>
                    <br>
                    <button type="submit">Registrar</button>
</form>

    </body>
</html>
