package dev.rampmaster;

import java.util.HashSet;

public class Docente extends  Usuario implements  Colaborable{
    private int annosExp;
    private boolean profesorJefe;
    private String titulo;

    public Docente(int annosExp, boolean profesorJefe, String titulo, String nombre, String apellido, int run, String correo){
        super(nombre,apellido, run,  correo);
        this.annosExp = annosExp;
        this.profesorJefe = profesorJefe;
        this.titulo = titulo;
    }

    public int getAnnosExp(){
        return  annosExp;
    }
    public void setAnnosExp(int nuevoAnnosExp){
        this.annosExp = nuevoAnnosExp;
    }
    public boolean getProfesorJefe(){
        return  profesorJefe;
    }
    public void setProfesorJefe(boolean nuevoProfesorJefe){
        this.profesorJefe = nuevoProfesorJefe;
    }
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo( String nuevoTitulo){
        this.titulo = nuevoTitulo;

    }

    @Override
    public int consultarSaldo() {
        return 0;
    }
}
