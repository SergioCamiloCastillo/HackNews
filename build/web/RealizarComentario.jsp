<%-- 
    Document   : RealizarComentario
    Created on : 18/03/2019, 11:37:55 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Comentarios</h1>
        <form action="GuardarComentario.do" method="POST">
            
            <textarea name='txtComentario' id='txtComentario' cols="50" rows="10"> </textarea> 
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
