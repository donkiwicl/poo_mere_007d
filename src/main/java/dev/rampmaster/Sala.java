package dev.rampmaster;

public class Sala {
    private String numeroSala;
    private int capacidadMaxima;
    private  String encargado;

    public Sala(String numeroSala, int capacidadMaxima, String encargado){
        this.numeroSala = numeroSala;
        this.capacidadMaxima = capacidadMaxima;
        this.encargado = encargado;

    }

    public String getNumeroSala() {
        return numeroSala;
    }

    public void setNumeroSala(String numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getEncargado() {
        return encargado;
    }

    public void setEncargado(String encargado) {
        this.encargado = encargado;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }
}
