package dev.rampmaster;

public class Administrativo extends User{
    private String departamento;


    //CONSTRUCTOR
    public Administrativo(String nombre, String apellido, String email, String run, String departamento){
        super(nombre, apellido, email, run);
        this.departamento = departamento;

    }

    //GETTERS Y SETTERS
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
