package dev.rampmaster;

public class Usuario {
    protected String nombre;
    protected String apellido;
    protected String correo;
    protected String run;

    public Usuario(String nombre,String apellido,String correo,String run){
        this.nombre=nombre;
        this.apellido=apellido;
        this.correo=correo;
        this.run=run;

    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public String getApellido(){
        return this.apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public String getCorreo(){
        return this.correo;
    }
    public void setCorreo(String correo){
        this.correo=correo;
    }
    public String getRun() {
        return this.run;
    }
    public void setRun(String run) {
        this.run=run;
    }



































}
