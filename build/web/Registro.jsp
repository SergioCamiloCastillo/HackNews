<%-- 
    Document   : Registro
    Created on : 9/03/2019, 11:14:57 AM
    Author     : Windows 7
--%>

<%@page import="java.io.FileNotFoundException"%>
<%@page import="java.io.BufferedReader"%>
<%@page import="java.io.FileReader"%>
<%@page import="java.io.PrintWriter"%>
<%@page import="java.io.IOException"%>
<%@page import="java.io.OutputStreamWriter"%>
<%@page import="java.io.Writer"%>
<%@page import="java.io.FileWriter"%>
<%@page import="java.io.BufferedWriter"%>
<%@page import="java.util.List"%>
<%@page import="javax.naming.Context"%>
<%@page import="java.io.BufferedOutputStream"%>
<%@page import="modelo.Persona"%>
<%@page import="java.io.ObjectOutputStream"%>
<%@page import="java.io.ObjectInputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.File"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrar</title>
    </head>
    <body>
        <h1>Registrar Usuario</h1>
        <form action="RegistrarUsuarioServlet.do" method="POST">
            <input type="text" name="txtUsuario" id="txtUsuario" placeholder="Coloca usuario" required=""></br>
            <input type="password" name="txtContrasena" id="txtUsuario" placeholder="Coloca contraseña" required=""></br>
            <input type="submit" value="Enviar">


        </form>
        <h1>Iniciar Sesion</h1>

        <form action="InicioSesion.do" method="POST">
            <input type="text" name="txtVerificarUsuario" id="txtUsuario" placeholder="Coloca usuario" required=""></br>
            <input type="password" name="txtVerificarContrasena" id="txtUsuario" placeholder="Coloca contraseña" required=""></br>
            <input type="submit" value="Enviar">


        </form>
        <%
            
            HttpSession Sesion = request.getSession(false);
            ArrayList<Persona> datos = (ArrayList) Sesion.getAttribute("listado");
            
            File archivo = null;
            FileReader fr = null;
            BufferedReader br = null;

            try {
                String linea;

                archivo = new File("C:\\Users\\User\\Documents\\NetbeansProjects\\HackNews\\web\\Usuarios.txt");
                fr = new FileReader(archivo);
                br = new BufferedReader(fr);

                // Lectura del fichero
               
                ArrayList lineass=new ArrayList();
                while ((linea = br.readLine()) != null) {
                    lineass.add(linea);
                    
                    

                }
                
                out.println("</br></br><h3>Usuario Registrados</h3>");
                for(int i=0;i<lineass.size();i++){
                    String lin=(String) lineass.get(i);
                    
                    out.println(lin + "</br>");
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
