package dev.rampmaster;

import java.util.HashSet;

public class Sede {
    private String nombreSede;
    private String direccionSede;
    private int cantidadPisos;
    private HashSet<Piso> pisos;

    public Sede (String nombreSede, String direccionSede, int cantidadPisos) {
        this.nombreSede = nombreSede;
        this.direccionSede = direccionSede;
        this.cantidadPisos = cantidadPisos;
        HashSet<Piso> pisos = new HashSet<>();
    }

    public String getNombreSede() {
        return nombreSede;
    }
    public void setNombreSede(String nombreSede) {
        this.nombreSede = nombreSede;
    }
    public String getDireccionSede() {
        return direccionSede;
    }
    public void setDireccionSede(String direccionSede) {
        this.direccionSede = direccionSede;
    }
    public int getCantidadPisos() {
        return cantidadPisos;
    }
    public void setCantidadPisos(int cantidadPisos) {
        this.cantidadPisos = cantidadPisos;
    }
    public HashSet<Piso> getPisos() {
        return pisos;
    }
    public void setPisos(HashSet<Piso> pisos) {
        this.pisos = pisos;
    }
}
