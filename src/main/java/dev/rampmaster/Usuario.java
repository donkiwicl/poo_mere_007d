package dev.rampmaster;
//CLASE
public abstract class Usuario {
    //ATRIBUTOS
    private String nombre;
    private String apellido;
    private String correo;
    private String run;

    //CONTROLADORES
    public Usuario(String nombre, String apellido, String correo, String run) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.run = run;
    }

    //GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    //METODOS DE COMPORTAMIENTO
}
