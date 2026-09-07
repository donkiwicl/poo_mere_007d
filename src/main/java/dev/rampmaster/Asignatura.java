package dev.rampmaster;

public class Asignatura {
    private String nombreAsignatura;
    private String siglas;
    private String descripcion;
    private Sede sede;

    public Asignatura(String nombreAsignatura, String siglas, String descripcion, Sede sede) {
        this.nombreAsignatura = nombreAsignatura;
        this.siglas = siglas;
        this.descripcion = descripcion;
        this.sede = sede;
    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }
    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }
    public String getSiglas() {
        return siglas;
    }
    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public Sede getSede() {
        return sede;
    }
    public void setSede(Sede sede) {
        this.sede = sede;
    }
}
