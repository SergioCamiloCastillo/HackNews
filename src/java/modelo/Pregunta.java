
package modelo;

public class Pregunta {
    private int id_pregunta;
    private String pregunta;

    public Pregunta(int id_pregunta, String pregunta) {
        this.id_pregunta = id_pregunta;
        this.pregunta = pregunta;
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
