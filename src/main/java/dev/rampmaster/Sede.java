package dev.rampmaster;

import java.util.HashSet;

public class Sede {

    private HashSet<Piso> pisos;
    private String nombre;
    private String direccion;

    public Sede(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.pisos = new HashSet<>();
    }

    public HashSet<Piso> getPisos() {

        return this.pisos;

    }

    public void setPisos(HashSet<Piso> pisos) {

        this.pisos = pisos;
    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public String getDireccion() {

        return direccion;

    }

    public void setDireccion(String direccion) {

        this.direccion = direccion;

    }

    public void obtenerPiso() {

        System.out.println("La cantidad de pisos de la sede es de: " + this.pisos.size());

    }

    public void agregarPiso(Piso piso){
        this.pisos.add(piso);
    }

}
