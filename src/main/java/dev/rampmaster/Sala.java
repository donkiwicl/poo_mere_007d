package dev.rampmaster;

public class Sala {
    private String nombre_sala;
    private int Cantidad_de_alumnos;
    public Sala(String nombre_sala, int Cantidad_de_alumnos) {
        this.nombre_sala = nombre_sala;
        this.Cantidad_de_alumnos = Cantidad_de_alumnos;
    }
    public String getNombre_sala() {
        return nombre_sala;
    }
    public void setNombre_sala(String nombre_sala) {
        this.nombre_sala = nombre_sala;
    }
    public int getCantidad_de_alumnos() {
        return Cantidad_de_alumnos;
    }

    public void setCantidad_de_alumnos(int cantidad_de_alumnos) {
        Cantidad_de_alumnos = cantidad_de_alumnos;
    }
}
