package dev.rampmaster.entidades;

import java.util.List;

public class Asignatura {
    private int id;
    private String nombre;
    private List<Seccion> secciones;

    public Asignatura(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void addSeccion(Seccion seccion){
        this.secciones.add(seccion);
        seccion.addAsignatura(this);
    }
}
