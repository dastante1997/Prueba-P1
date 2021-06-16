
package Dominio;

public class Estudiante {
    int notas;
    String genero;
    String estudiante;

    public Estudiante(int notas, String genero, String estudiante) {
        this.notas = notas;
        this.genero = genero;
        this.estudiante = estudiante;
        
    }

    public void setNotas(int notas) {
        this.notas = notas;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public int getNotas() {
        return notas;
    }
    public String getGenero() {
       return genero;
    }
    public String getEstudiante() {
        return estudiante;
    }

    
    @Override
    public String toString() {
        return "Estudiante{" + "notas=" + notas + ", genero=" + genero + ", estudiante=" + estudiante + '}';
    }
    
}
