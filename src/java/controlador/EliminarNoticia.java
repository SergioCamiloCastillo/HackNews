/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
public class EliminarNoticia extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        PrintWriter out = response.getWriter();

        File archivo = null;
        File archivo2 = null;
        FileReader fr = null;
        BufferedReader br = null;
        File archivo1 = null;
        FileReader fr1 = null;
        BufferedReader br1 = null;
        String eliminarNoticia = request.getParameter("txtEliminarNoticia");
        archivo = new File("C:\\Users\\User\\Documents\\NetbeansProjects\\HackNews\\web\\Noticias.txt");
        fr = new FileReader(archivo);
        br = new BufferedReader(fr);
        archivo1 = new File("C:\\Users\\User\\Documents\\NetbeansProjects\\HackNews\\web\\NoticiasLaborales.txt");
        fr1 = new FileReader(archivo1);
        br1 = new BufferedReader(fr1);
        // Lectura del fichero
        String noticias;
        String noticias1;
        ArrayList lineas = new ArrayList();
        ArrayList lineas1 = new ArrayList();
        while ((noticias = br.readLine()) != null) {
            lineas.add(noticias);

        }
        for (int i = 0; i < lineas.size(); i++) {
            String linea = (String) lineas.get(i);
            if (linea.contains(eliminarNoticia)) {
                lineas.remove(i);

                //getServletContext().getRequestDispatcher("/Noticias.jsp").forward(request, response);
            }

            out.println(lineas.get(i)  + "</br>");

            FileWriter escribir = new FileWriter("C:\\Users\\User\\Documents\\NetbeansProjects\\HackNews\\web\\Noticias.txt");

//Escribimos en el archivo con el metodo write 
            escribir.write(lineas.get(i) + " ");

            escribir.write("\r\n");

            archivo.renameTo(archivo);
            escribir.close();

            //getServletContext().getRequestDispatcher("/index.html").forward(request, response);
        }/*
        while ((noticias1 = br1.readLine()) != null) {
            lineas1.add(noticias1);

        }
        for (int j = 0; j < lineas1.size(); j++) {
            String linea1 = (String) lineas1.get(j);
            if (linea1.contains(eliminarNoticia)) {
                lineas1.remove(j);
                
                getServletContext().getRequestDispatcher("/Noticias.jsp").forward(request, response);
                out.close();
                br1.close();
                break;
            }

            //out.println(linea + "</br>");
        }*/

    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
