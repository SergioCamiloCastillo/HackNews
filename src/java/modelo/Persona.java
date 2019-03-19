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
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Windows 7
 */
public class Persona implements Serializable {

    private String usuario;
    private String contrasena;

    public Persona(String nombre, String contrasena) {
        this.usuario = nombre;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return usuario;
    }

    public void setNombre(String nombre) {
        this.usuario = nombre;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return usuario + contrasena;
    }

    public String buscarNoticia(String titulo) throws FileNotFoundException, IOException {
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        archivo = new File("C:\\Users\\User\\Documents\\NetbeansProjects\\HackNews\\web\\Noticias.txt");
        fr = new FileReader(archivo);
        br = new BufferedReader(fr);

        // Lectura del fichero
        String noticias;

        String linea = null;
        ArrayList lineas = new ArrayList();

        while ((noticias = br.readLine()) != null) {
            lineas.add(noticias);

        }
        for (int i = 0; i < lineas.size(); i++) {
            linea = (String) lineas.get(i);
            if (linea.contains(titulo)) {
                return linea;
            }

            //out.println(linea + "</br>");
        }
        //return linea;
        return "";
    }

    public String buscarNoticiaLaboral(String titulo) throws FileNotFoundException, IOException {
        File archivo1 = null;
        FileReader fr1 = null;
        BufferedReader br1 = null;
        String noticias1;
        ArrayList lineas1 = new ArrayList();
        archivo1 = new File("C:\\Users\\User\\Documents\\NetbeansProjects\\HackNews\\web\\NoticiasLaborales.txt");
        fr1 = new FileReader(archivo1);
        br1 = new BufferedReader(fr1);
        while ((noticias1 = br1.readLine()) != null) {
            lineas1.add(noticias1);

        }
        for (int j = 0; j < lineas1.size(); j++) {
            String linea1 = (String) lineas1.get(j);
            if (linea1.contains(titulo)) {
                return linea1;
            }

            //out.println(linea + "</br>");
        }

        return "";
    }

    

    public void verComentario() {

    }

}
