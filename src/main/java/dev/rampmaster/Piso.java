package dev.rampmaster;

import java.util.HashSet;

public class Piso {
    private String nombre;
    private HashSet<Sala> salas;
    private int cantidad;

    public Piso(String nombre) {
        this.nombre = nombre;
        this.salas = new HashSet<>();
        this.cantidad = 0;
    }

    public HashSet<Sala> getSalas() {

        return salas;

    }

    public void setSalas(HashSet<Sala> salas) {

        this.salas = salas;

    }

    public int getCantidad() {

        return cantidad;

    }

    public void setCantidad(int cantidad) {

        this.cantidad = cantidad;

    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void obtenerSalas() {

        System.out.println("La cantidad de salas por piso es de : " + this.salas.size());
    }

}
