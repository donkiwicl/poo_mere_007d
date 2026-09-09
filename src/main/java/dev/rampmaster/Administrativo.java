package dev.rampmaster;

public class Administrativo extends Usuario {
    private String cargo;
    private int salario;

    public Administrativo(String nombre, String apellido, String email, String run, String cargo, int salario) {
        super(nombre, apellido, email, run);
        this.cargo = cargo;
        this.salario = salario;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    public int getSalario() {
        return salario;
    }
    public void setSalario(int salario) {
        this.salario = salario;
    }
}
