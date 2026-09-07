package dev.rampmaster;

public class Docente extends Usuario {

    //ATRIBUTOS NUEVOS
    private String asignatura;
    private String especialidad;

    //CONTROLADORES Y SUPER
    public Docente(String nombre, String apellido, String correo, String run, String asignatura, String especialidad) {
        super(nombre, apellido, correo, run);
        this.asignatura = asignatura;
        this.especialidad = especialidad;
    }

    //GETTERS Y SETTERS NUEVOS
    public String getAsignatura() {
        return asignatura;
    }
    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    //METODOS DE COMPORTAMIENTO NUEVOS
}
