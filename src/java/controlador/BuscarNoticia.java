/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class BuscarNoticia extends HttpServlet {

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

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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

        String noticiaBuscar = request.getParameter("txtBuscarNoticia");
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
        File archivo1 = null;
        FileReader fr1 = null;
        BufferedReader br1 = null;
        try {

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
                if (linea.contains(noticiaBuscar)) {
                    out.println(lineas.get(i) + "</br>");
                }

                //out.println(linea + "</br>");
            }
            while ((noticias1 = br1.readLine()) != null) {
                lineas1.add(noticias1);

            }
            for (int j = 0; j < lineas1.size(); j++) {
                String linea1 = (String) lineas1.get(j);
                if (linea1.contains(noticiaBuscar)) {
                    out.println(lineas1.get(j));
                } 

                //out.println(linea + "</br>");
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
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
