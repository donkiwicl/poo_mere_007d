package dev.rampmaster;

import java.util.HashSet;

public class Piso {
    private int numero_piso;
    private int cantidad_de_salas;
    private HashSet<Sala> salas = new HashSet<Sala>();
    public Piso(int numero_piso, int cantidad_de_salas) {
        this.numero_piso = numero_piso;
        this.cantidad_de_salas = cantidad_de_salas;
    }
    public int getNumero_piso() {
        return numero_piso;
    }
    public void setNumero_piso(int numero_piso) {
        this.numero_piso = numero_piso;
    }
    public int getCantidad_de_salas() {
        return cantidad_de_salas;
    }
    public void setCantidad_de_salas(int cantidad_de_salas) {
        this.cantidad_de_salas = cantidad_de_salas;
    }
    public HashSet<Sala> getSalas() {
        return salas;
    }
}
