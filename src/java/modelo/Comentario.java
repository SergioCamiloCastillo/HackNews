
package modelo;

import java.util.Date;


public class Comentario {
    private int id_comentario;
    private int id_noticia;
    private Date horaComentario;
    private String usuario;
    private String texto;

    public Comentario(int id_comentario, int id_noticia, Date horaComentario, String usuario, String texto) {
        this.id_comentario = id_comentario;
        this.id_noticia = id_noticia;
        this.horaComentario = horaComentario;
        this.usuario = usuario;
        this.texto = texto;
    }

    public int getId_comentario() {
        return id_comentario;
    }

    public void setId_comentario(int id_comentario) {
        this.id_comentario = id_comentario;
    }

    public int getId_noticia() {
        return id_noticia;
    }

    public void setId_noticia(int id_noticia) {
        this.id_noticia = id_noticia;
    }

    public Date getHoraComentario() {
        return horaComentario;
    }

    public void setHoraComentario(Date horaComentario) {
        this.horaComentario = horaComentario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return  ""+id_comentario+ id_noticia+ horaComentario+ usuario+ texto;
    }
    
}
