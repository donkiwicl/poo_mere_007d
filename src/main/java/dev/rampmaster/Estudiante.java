package dev.rampmaster;

public class Estudiante extends  Usuario {
    private String curso;
    private int totalAnotaciones;

    public Estudiante(String curso, int totalAnotaciones, String nombre, String apellido, int run, String correo ){
        super(nombre,apellido, run,  correo);
        this.curso = curso;
        this. totalAnotaciones = totalAnotaciones;
    }
    public String getCurso(){
        return curso;
    }
    public void setCurso(String nuevoCurso){
        this.curso = nuevoCurso;

    }
    public  int getTotalAnotaciones(){
        return totalAnotaciones;
    }
    public void setTotalAnotaciones(int nuevoTotalAnotaciones){
        this.totalAnotaciones = nuevoTotalAnotaciones;
    }
}
