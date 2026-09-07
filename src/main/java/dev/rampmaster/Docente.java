package dev.rampmaster;

import java.util.HashSet;

public class Docente extends User {
    private String escuela;
    private HashSet<Asignatura> asignaturasImpartidas;

    public Docente(String nombre, String apellido, String email, String run, String escuela) {
        super(nombre, apellido, email, run);
        this.escuela = escuela;
        HashSet<Asignatura> asignaturasImpartidas = new HashSet<>();
    }

    public String getEscuela() {
        return escuela;
    }
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }
    public HashSet<Asignatura> getAsignaturasImpartidas() {
        return asignaturasImpartidas;
    }
    public void setAsignaturasImpartidas(HashSet<Asignatura> asignaturasImpartidas) {
        this.asignaturasImpartidas = asignaturasImpartidas;
    }
}
