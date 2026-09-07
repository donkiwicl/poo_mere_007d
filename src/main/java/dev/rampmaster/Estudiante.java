package dev.rampmaster;

public class Estudiante extends User {
    private String carrera;
    private String jornada;
    private boolean tieneGratuidad;

    public Estudiante(String nombre, String apellido, String email, String run, String carrera, String jornada, boolean tieneGratuidad) {
        super(nombre, apellido, email, run);
        this.carrera = carrera;
        this.jornada = jornada;
        this.tieneGratuidad = tieneGratuidad;
    }

    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getJornada() {
        return jornada;
    }
    public void setJornada(String jornada) {
        this.jornada = jornada;
    }
    public boolean isTieneGratuidad() {
        return tieneGratuidad;
    }
    public void setTieneGratuidad(boolean tieneGratuidad) {
        this.tieneGratuidad = tieneGratuidad;
    }
}
