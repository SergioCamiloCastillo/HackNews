<%-- 
    Document   : CrearNoticiaLaboral
    Created on : 14/03/2019, 06:36:44 PM
    Author     : User
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>NoticiasLaborales</title>
    </head>
    <body>
        <h1>Noticias Laborales</h1>
        <form action="CrearNoticiaLaboral.do" method="POST">
            <input type="text" name="txtUrlNoticiaLaboral" required="" placeholder="Coloque la url"></br></br>
            <input type="text" name="txtTituloNoticiaLaboral" placeholder="Coloque el titulo" required=""></br></br>
            <input type="submit" value="Enviar">
        </form>



    </body>
</html>
