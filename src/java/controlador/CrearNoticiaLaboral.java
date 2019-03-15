/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.NoticiaLaboral;

/**
 *
 * @author User
 */
public class CrearNoticiaLaboral extends HttpServlet {

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
        String urlNT=request.getParameter("txtUrlNoticiaLaboral");
        String tituloNT=request.getParameter("txtTituloNoticiaLaboral");
         java.util.Date fechaNL = new Date();
        NoticiaLaboral nl=new NoticiaLaboral(0,0,urlNT, tituloNT, null,fechaNL,null);
        FileWriter escribir = new FileWriter("C:\\Users\\User\\Documents\\NetbeansProjects\\HackNews\\web\\NoticiasLaborales.txt", true);
       
//Escribimos en el archivo con el metodo write 
        escribir.write(nl.getTitulo() + " ");
        escribir.write(nl.getUrl() + " ");
        escribir.write(nl.getFecha().toString());
        escribir.write("\r\n");
        escribir.close();
        getServletContext().getRequestDispatcher("/index.html").forward(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
