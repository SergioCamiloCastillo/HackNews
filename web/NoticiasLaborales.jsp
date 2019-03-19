<%-- 
    Document   : NoticiasLaborales
    Created on : 14/03/2019, 07:04:42 PM
    Author     : User
--%>

<%@page import="java.io.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Noticias laborales</h1>
        <%

            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;

            try {

                archivo = new File("C:\\Users\\User\\Documents\\NetbeansProjects\\HackNews\\web\\NoticiasLaborales.txt");
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);

                // Lectura del fichero
                String noticiasLab;

                while ((noticiasLab = br.readLine()) != null) {
                
                    out.println(noticiasLab + "<a href='RealizarComentario.jsp'> Comentar</a></br>");
                   

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
    </body>
</html>
