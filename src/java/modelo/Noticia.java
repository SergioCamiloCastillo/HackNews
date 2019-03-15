
package modelo;

import java.util.Date;


public class Noticia {
    private int id_noticia;
    private String titulo;
    private String url;
    private String texto;
    private String usuario;
    private Date fecha;

    

    public Noticia(int id_noticia, String titulo, String url, String texto,Date fecha, String usuario) {
        this.id_noticia = id_noticia;
        this.titulo = titulo;
        this.url = url;
        this.texto = texto;
        this.usuario = usuario;
        this.fecha=fecha;
    }
    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int getId_noticia() {
        return id_noticia;
    }

    public void setId_noticia(int id_noticia) {
        this.id_noticia = id_noticia;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    

    

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    
    
}
