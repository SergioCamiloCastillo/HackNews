/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.FileWriter;
import java.io.IOException;

import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Persona;

/**
 *
 * @author Windows 7
 */
public class RegistrarUsuarioServlet extends HttpServlet {

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

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
        PrintWriter out = response.getWriter();
        response.setContentType("text/html;charset=UTF-8");

        String usuario = request.getParameter("txtUsuario");
        String contrasena = request.getParameter("txtContrasena");

        //HttpSession misession = request.getSession(true);
        Persona p = new Persona(usuario, contrasena);

        p.getContrasena();
        p.getNombre();

        ArrayList<String> person = new ArrayList<String>();
        person.add(0, p.getNombre());
        person.add(1,",");
        person.add(2, p.getContrasena());
        
       
        for (int i = 0; i < person.size(); i++) {
            out.print(person.get(i));
        }

        //person.add(p);
        //;
        // ;
        FileWriter escribir = new FileWriter("C:\\Users\\User\\Documents\\NetbeansProjects\\HackNews\\web\\Usuarios.txt", true);

//Escribimos en el archivo con el metodo write 
        escribir.write(p.getNombre()+" ");
        
        escribir.write(p.getContrasena()+" ");
        escribir.write("\r\n");
        
//Cerramos la conexion
        escribir.close();

        request.setAttribute("listado", p);
        getServletContext().getRequestDispatcher("/Registro.jsp").forward(request, response);
        

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
