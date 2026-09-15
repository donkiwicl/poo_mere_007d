package dev.rampmaster;

import java.util.HashSet;

public class Sala {

    private String capacidad;
    private HashSet<Piso> pisos;

    public Sala(String capacidad, HashSet<Piso> pisos) {

        this.capacidad = capacidad;

    }

    public String getCapacidad() {

        return capacidad;

    }

    public void setCapacidad(String capacidad) {

        this.capacidad = capacidad;

    }

    public HashSet<Piso> getPisos() {

        return pisos;

    }

    public void setPisos(HashSet<Piso> pisos) {

        this.pisos = pisos;

    }

    public void obtenerCapacidad() {

        System.out.println("La capacidad de cada sala es de : " + getCapacidad());

    }

    public void obtenerSala() {

        System.out.println("La sala con capacidad:" + getCapacidad() + "esta en el piso:" + getPisos());

    }

}
