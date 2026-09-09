package dev.rampmaster.entidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Estudiante extends Usuario {
    private List<Seccion> seccions = new ArrayList<>();

    public Estudiante(String nombre, String apellido, String email, String rut) {
        super(nombre, apellido, email, rut);
    }

    public List<Seccion> getSecciones() {
        return seccions;
    }

    public void addSeccion(Seccion seccion) {
        this.seccions.add(seccion);
    }


    @Override
    public void detalleUser() {
        System.out.println("=== Estudiante ===");
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("Apellido: " + this.getApellido());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Rut: " + this.getRut());
        System.out.println("Secciones:");
        for (Seccion seccion : this.seccions) {
            System.out.println(seccion);
        }

    }
}
