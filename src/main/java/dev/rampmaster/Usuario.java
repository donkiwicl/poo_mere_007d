package dev.rampmaster;

public class Usuario {
    protected String nombre;
    protected String apellido;
    protected int run;
    protected String correo;

    public Usuario(String nombre, String apellido, int run, String correo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.run = run;
        this.correo = correo;

    }

    public String getNombre(){
        return nombre;
    }
    public  void setNombre(String nuevoNombre){
        this.nombre = nuevoNombre;
    }
    public String getApellido(){
        return  apellido;
    }
    public void setApellido(String nuevoApellido){
        this.apellido = nuevoApellido;
    }
    public int getRun() {
        return run;

    }
    public void setRun(int nuevoRun){
        this.run = nuevoRun;
    }
    public String getCorreo(){
        return correo;
    }
    public void setCorreo( String nuevoCorreo){
        this.correo = nuevoCorreo;
    }

}
