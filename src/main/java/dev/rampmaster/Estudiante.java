package dev.rampmaster;

public class Estudiante {

    //ATRIBUTOS NUEVOS
    private String nombreCarrera;
    private String jornada;

    //CONTROLADORES Y SUPER
    public Estudiante(String nombre, String apellido, String correo, String run, String nombreCarrera, String jornada) {
        this.nombreCarrera = nombreCarrera;
        this.jornada = jornada;
    }

    //GETTERS Y SETTERS NUEVOS
    public String getNombreCarrera() {
        return nombreCarrera;
    }
    public void setNombreCarrera(String nombreCarrera) {
        this.nombreCarrera = nombreCarrera;
    }

    public String getJornada() {
        return jornada;
    }
    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    //METODOS DE COMPORTAMIENTO NUEVOS
}
