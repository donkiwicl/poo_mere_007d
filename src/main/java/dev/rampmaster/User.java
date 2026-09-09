package dev.rampmaster;

public abstract class User {
    private String nombre;
    private String apellido;
    private String email;
    private String run;


    public User(String nombre, String apellido, String email, String run) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.run = run;
    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return this.nombre;
    }
    public String getApellido() {
        return this.apellido;
    }
    public String getEmail() {
        return this.email;
    }
    public String getRun() {
        return this.run;
    }
    public void setNombre(String name) {
        this.nombre = name;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setRun(String run) {
        this.run = run;
    }

}
