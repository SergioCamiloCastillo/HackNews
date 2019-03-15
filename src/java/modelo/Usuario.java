/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

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
        super(usuario,contrasena);
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

    public void registrarUsuario(String usuario, String contrasena){
   
        

    }
    
    public String enviarComentario(String comentario){
        return comentario;
    }
    public void enviarNoticia(String titulo, String url, String texto){
        
    }
    public void realizarPregunta(String pregunta){
        
    } 
    
    
    
    
}
