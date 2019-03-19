/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Windows 7
 */
public class Usuario extends Persona {

    private String correo;
    private Date fechaRegistro;

    public Usuario(String usuario, String contrasena, String correo, Date fechaRegistro) {
        super(usuario, contrasena);
        this.correo = correo;
        this.fechaRegistro = fechaRegistro;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Date getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void registrarUsuario(String usuario, String contrasena) {

    }

    public String enviarComentario(String comentario, Date fechas) throws IOException {
        Comentario comen = new Comentario(0, 0, fechas, null, comentario);

        ArrayList<String> comentarios = new ArrayList<String>();

        FileWriter escribirC = new FileWriter("C:\\Users\\User\\Documents\\NetbeansProjects\\HackNews\\web\\Comentarios.txt", true);

//Escribimos en el archivo con el metodo write 
        escribirC.write(comen.getTexto() + " ");
        escribirC.write(comen.getHoraComentario().toString());

        escribirC.write("\r\n");
        escribirC.close();
        return "";
    }

    public void enviarNoticia(String titulo, String url, String texto, Date fecha) throws IOException {
        Noticia noti = new Noticia(0, titulo, url, texto, fecha, null);

        ArrayList<String> noticias = new ArrayList<String>();

        FileWriter escribir = new FileWriter("C:\\Users\\User\\Documents\\NetbeansProjects\\HackNews\\web\\Noticias.txt", true);

//Escribimos en el archivo con el metodo write 
        escribir.write(noti.getTitulo() + " ");
        escribir.write(noti.getUrl() + " ");
        escribir.write(noti.getTexto() + " ");
        escribir.write(noti.getFecha().toString());
        escribir.write("\r\n");
        escribir.close();
    }

    public void enviarNoticiaLaboral(String urlNT, String tituloNT, Date fechaNL) throws IOException {
        NoticiaLaboral nl = new NoticiaLaboral(0, 0, urlNT, tituloNT, null, fechaNL, null);
        FileWriter escribir = new FileWriter("C:\\Users\\User\\Documents\\NetbeansProjects\\HackNews\\web\\NoticiasLaborales.txt", true);

//Escribimos en el archivo con el metodo write 
        escribir.write(nl.getTitulo() + " ");
        escribir.write(nl.getUrl() + " ");
        escribir.write(nl.getFecha().toString());
        escribir.write("\r\n");
        escribir.close();
    }

    public void realizarPregunta(String pregunta, Date fecha) throws IOException {
        Pregunta pre = new Pregunta(0, pregunta, fecha);
        FileWriter escribir = new FileWriter("C:\\Users\\User\\Documents\\NetbeansProjects\\HackNews\\web\\Preguntas.txt", true);

//Escribimos en el archivo con el metodo write 
        escribir.write(pre.getPregunta() + " ");
        escribir.write(pre.getFecha() + " ");

        escribir.write("\r\n");
        escribir.close();
    }

    public void eliminarNoticia(String titulo) throws FileNotFoundException, IOException {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        archivo = new File("C:\\Users\\User\\Documents\\NetbeansProjects\\HackNews\\web\\Noticias.txt");
        fr = new FileReader(archivo);
        br = new BufferedReader(fr);

        // Lectura del fichero
        String noticias;

        ArrayList lineas = new ArrayList();
        while ((noticias = br.readLine()) != null) {
            lineas.add(noticias);

        }
        for (int i = 0; i < lineas.size(); i++) {
            String linea = (String) lineas.get(i);
            if (linea.contains(titulo)) {
                lineas.remove(i);

                //getServletContext().getRequestDispatcher("/Noticias.jsp").forward(request, response);
            }

            FileWriter escribir = new FileWriter("C:\\Users\\User\\Documents\\NetbeansProjects\\HackNews\\web\\Noticias.txt");

//Escribimos en el archivo con el metodo write 
            escribir.write(lineas.get(i) + " ");

            escribir.write("\r\n");

            archivo.renameTo(archivo);
            escribir.close();

        }

    }

}
