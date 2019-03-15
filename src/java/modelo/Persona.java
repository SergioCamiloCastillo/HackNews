/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.io.Serializable;

/**
 *
 * @author Windows 7
 */
public class Persona implements Serializable{
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
        return  usuario +  contrasena ;
    }
    public String buscarNoticia(String titulo   ){
        return "";
    }
    public void verNoticia(){
        
    }
    public void verComentario(){
        
    }

    
}
