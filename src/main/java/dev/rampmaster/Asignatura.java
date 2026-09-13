package dev.rampmaster;

public class Asignatura {
    protected String encargado;
    protected int cantidadCursos;
    protected  String nombreAsignatura;


    public Asignatura(String encargado, int cantidadCursos, String nombreAsignatura){
        this.encargado = encargado;
        this.cantidadCursos = cantidadCursos;
        this.nombreAsignatura = nombreAsignatura;
    }

    public int getCantidadCursos() {
        return cantidadCursos;
    }

    public void setCantidadCursos(int cantidadCursos) {
        this.cantidadCursos = cantidadCursos;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }
}
