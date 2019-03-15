
package modelo;

import java.util.Date;

public class NoticiaLaboral extends Noticia {
    private int id_noticiaLaboral;

    

    public NoticiaLaboral(int id_noticiaLaboral, int id_noticia, String titulo, String url, String texto, Date fecha, String usuario) {
        super(id_noticia, titulo, url, texto, fecha,usuario);
        this.id_noticiaLaboral = id_noticiaLaboral;
    }

    public int getId_noticiaLaboral() {
        return id_noticiaLaboral;
    }

    public void setId_noticiaLaboral(int id_noticiaLaboral) {
        this.id_noticiaLaboral = id_noticiaLaboral;
    }

    @Override
    public String toString() {
        return  ""+id_noticiaLaboral ;
    }
    
    
}
