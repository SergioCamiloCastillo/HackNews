<%-- 
    Document   : RegistrarPregunta
    Created on : 19/03/2019, 12:37:29 PM
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
        <h1>Preguntar</h1>
        <form action="RegistrarPregunta.do" method="POST">
            <input type="text" name="txtPregunta" id="txtPregunta" placeholder="Escribir pregunta">
            <input type="submit" value="Enviar">
            
        </form>
    </body>
</html>
