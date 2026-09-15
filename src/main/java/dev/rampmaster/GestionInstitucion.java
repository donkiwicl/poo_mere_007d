package dev.rampmaster;

import java.util.ArrayList;
import java.util.List;

public class GestionInstitucion {

  private List<Sede> sedes;

  public GestionInstitucion() {

    this.sedes = new ArrayList<>();

  }

  // Create

  public Sede crearSede(String nombre, String direccion) {

    Sede nuevaSede = new Sede(nombre, direccion);

    sedes.add(nuevaSede);

    System.out.println("Sede: " + nombre + " a sido creada exitosamente.");

    return nuevaSede;

  }

  public void crearPisoEnSede(String nombreSede, String numeroPiso) {

    Sede sede = this.leerSede(nombreSede);

    if (sede != null) {

      Piso nuevoPiso = new Piso(numeroPiso);

      sede.agregarPiso(nuevoPiso);

      System.out.println("Piso: " + numeroPiso + " agregado a la sede: " + nombreSede);

    }

  }

  // Read

  public Sede leerSede(String nombre) {

    for (Sede sede : sedes) {

      if (sede.getNombre().equalsIgnoreCase(nombre)) {

        return sede;

      }

    }

    System.out.println("Sede no encontrada.");
    return null;
  }

  public void listarInfraestructura() {

    if (sedes.isEmpty()) {

      System.out.println("No hay sedes registradas.");

    }

    for (Sede sede : sedes) {

      System.out.println("Sede: " + sede.getNombre());
      for (Piso piso : sede.getPisos()) {
        System.out.println(" Piso: " + piso.getNombre());
        for(Sala sala: piso.getSalas()){
          
        }

      }

    }

  }

  // Update

  public void actualizarSede(String nombreActual, String nuevoNombre, String nuevaDireccion) {

    Sede sede = leerSede(nombreActual);

    if (sede != null) {

      sede.setNombre(nuevoNombre);
      sede.setDireccion(nuevaDireccion);
      System.out.println("Sede actualizada exitosamente.");

    }

  }

  // Delete

  public void eliminarSede(String nombre) {

    Sede sede = leerSede(nombre);

    if (sede != null) {

      sedes.remove(sede); //Elimina todo lo que esta vinculado (en casada)

      System.out.println("Sede: " + nombre + " y toda la informacion vinculada a sido eliminada");

    }

  }

}



