package dev.rampmaster;

public class Sala {
    private String codigoSala;  //ej. "L3"
    private int capacidad;


    public Sala(String codigoSala, int capacidad) {
        this.codigoSala = codigoSala;
        this.capacidad = capacidad;
    }


    public String getCodigoSala() {
        return codigoSala;
    }
    public void setCodigoSala(String codigoSala) {
        this.codigoSala = codigoSala;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
}
