<%-- 
    Document   : Comentarios
    Created on : 14/03/2019, 12:23:11 PM
    Author     : User
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Comentarios</title>
    </head>
    <body>
        <%

            File archivo = null;
            FileReader fr2 = null;
            BufferedReader br2 = null;

            try {

                archivo = new File("C:\\Users\\User\\Documents\\NetbeansProjects\\HackNews\\web\\Comentarios.txt");
                fr2 = new FileReader(archivo);
                br2 = new BufferedReader(fr2);

                // Lectura del fichero
                String comentarios;
                ArrayList lineas = new ArrayList();
                while ((comentarios = br2.readLine()) != null) {
                    lineas.add(comentarios);

                }
                for (int i = 0; i < lineas.size(); i++) {
                    String linea = (String) lineas.get(i);
                    out.print(linea+"</br>");
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                // En el finally cerramos el fichero, para asegurarnos
                // que se cierra tanto si todo va bien como si salta 
                // una excepcion.
                try {
                    if (null != fr2) {
                        fr2.close();
                    }
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
        %>
        <a href="index.html">Ir a menu</a>
    </body>
</html>
