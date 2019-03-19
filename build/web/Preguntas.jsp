<%-- 
    Document   : Preguntas
    Created on : 19/03/2019, 12:36:51 PM
    Author     : User
--%>

<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Preguntas</h1>
        <%

            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;

            try {

                archivo = new File("C:\\Users\\User\\Documents\\NetbeansProjects\\HackNews\\web\\Preguntas.txt");
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);

                // Lectura del fichero
                String preguntas;

                while ((preguntas = br.readLine()) != null) {
                
                    out.println(preguntas + "<a href='RealizarComentario.jsp'> Comentar</a></br>");
                   

                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // En el finally cerramos el fichero, para asegurarnos
                // que se cierra tanto si todo va bien como si salta 
                // una excepcion.
                try {
                    if (null != fr) {
                        fr.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }

        %>
        <a href="index.html">Ir a menu</a>
    </body>
</html>
