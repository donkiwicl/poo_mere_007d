package dev.rampmaster;

import java.util.HashSet;

public class Sede {
    protected HashSet<Piso> pisos;
    private  int numeroSede;
    private String direccion;

    public Sede(HashSet<Piso> pisos, int numeroSede, String direccion){
        this.pisos  = pisos;
        this.numeroSede = numeroSede;
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getNumeroSede() {
        return numeroSede;
    }

    public void setNumeroSede(int numeroSede) {
        this.numeroSede = numeroSede;
    }

    public HashSet<Piso> getPisos() {
        return pisos;
    }

    public void setPisos(HashSet<Piso> pisos) {
        this.pisos = pisos;
    }
}
