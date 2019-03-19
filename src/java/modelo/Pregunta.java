
package modelo;

import java.util.Date;

public class Pregunta {
    private int id_pregunta;
    private String pregunta;
    private Date fecha;

    public Pregunta(int id_pregunta, String pregunta, Date fecha) {
        this.id_pregunta = id_pregunta;
        this.pregunta = pregunta;
        this.fecha=fecha;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getId_pregunta() {
        return id_pregunta;
    }

    public void setId_pregunta(int id_pregunta) {
        this.id_pregunta = id_pregunta;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

    @Override
    public String toString() {
        return "" + id_pregunta + pregunta ;
    }
    
}
