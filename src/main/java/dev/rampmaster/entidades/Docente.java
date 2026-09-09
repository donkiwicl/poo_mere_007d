package dev.rampmaster.entidades;

import java.util.ArrayList;
import java.util.List;

public class Docente extends Usuario {
    private List<Seccion> seccions = new ArrayList<>();
    private String especialidad;


    public Docente(String nombre, String apellido, String email, String rut, List<Seccion> seccions, String especialidad) {
        super(nombre, apellido, email, rut);
        this.seccions = seccions;
        this.especialidad = especialidad;
    }

    public List<Seccion> getSeccions() {
        return seccions;
    }






    public void addSeccion(Seccion seccion){
        this.seccions.add(seccion);
    }

    @Override
    public void detalleUser() {
        System.out.println("=== Docente ===");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellido: " + this.getApellido());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Rut: " + this.getRut());
    }
}
