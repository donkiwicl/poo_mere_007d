package dev.rampmaster;

import java.util.HashSet;

public class Sede {
    private String nombre_sede;
    private int cantidad_de_pisos;
    private HashSet <Piso> piso = new HashSet<Piso>();

    public Sede(String nombre_sede, int cantidad_de_pisos) {
        this.nombre_sede = nombre_sede;
        this.cantidad_de_pisos = cantidad_de_pisos;
    }
    public String getNombre_sede() {
        return nombre_sede;
    }
    public void setNombre_sede(String nombre_sede) {
        this.nombre_sede = nombre_sede;
    }
    public int getCantidad_de_pisos() {
        return cantidad_de_pisos;
    }
    public void setCantidad_de_pisos(int cantidad_de_pisos) {
        this.cantidad_de_pisos = cantidad_de_pisos;
    }

    public HashSet<Piso> getPiso() {
        return piso;
    }
    public void setPiso(HashSet<Piso> piso) {
        this.piso = piso;
    }
}