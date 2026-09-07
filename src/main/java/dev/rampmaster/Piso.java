package dev.rampmaster;

import java.util.HashSet;

public class Piso {
    private int numeroPiso;
    private int cantidadSalas;
    private HashSet<Sala> salas;

    public Piso(int numeroPiso, int cantidadSalas){
        this.numeroPiso = numeroPiso;
        this.cantidadSalas = cantidadSalas;
        HashSet<Sala> salas = new HashSet<>();
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }
    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }
    public int getCantidadSalas() {
        return cantidadSalas;
    }
    public void setCantidadSalas(int cantidadSalas) {
        this.cantidadSalas = cantidadSalas;
    }
    public HashSet<Sala> getSalas() {
        return salas;
    }
    public void setSalas(HashSet<Sala> salas) {
        this.salas = salas;
    }
}
