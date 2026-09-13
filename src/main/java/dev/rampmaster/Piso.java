package dev.rampmaster;

import java.util.HashSet;

public class Piso {
    private HashSet<Sala> salas;
    private int numeroPiso;

    public Piso(HashSet<Sala> salas, int numeroPiso){
        this.salas = salas;
        this.numeroPiso = numeroPiso;
    }

    public HashSet<Sala> getSalas() {
        return salas;
    }

    public void setSalas(HashSet<Sala> salas) {
        this.salas = salas;
    }

    public int getNumeroPiso() {
        return numeroPiso;
    }

    public void setNumeroPiso(int numeroPiso) {
        this.numeroPiso = numeroPiso;
    }
}
