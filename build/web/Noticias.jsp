<%-- 
    Document   : Noticias.jsp
    Created on : 14/03/2019, 12:22:58 PM
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
        <title>Noticias</title>
    </head>
    <body>
        <h1>Bienvenido a la seccion de noticias</h1>
        
        <%

            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;

            try {

                archivo = new File("C:\\Users\\User\\Documents\\NetbeansProjects\\HackNews\\web\\Noticias.txt");
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);

                // Lectura del fichero
                String noticias;
                ArrayList lineas=new ArrayList();
                while ((noticias = br.readLine()) != null) {
                    lineas.add(noticias);
                    
                    

                }
                for(int i=0;i<lineas.size();i++){
                    String linea=(String) lineas.get(i);
                    out.println(linea + "<a href='RealizarComentario.jsp'> Comentar</a></br>");
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
        <h3>Eliminar noticia</h3>
        <form action="EliminarNoticia.do" method="POST">
            <input type="text" name="txtEliminarNoticia" required="" placeholder="Coloque titulo"></br></br>
            <input type="submit" value="Enviar">
        </form>
    </body>
</html>
