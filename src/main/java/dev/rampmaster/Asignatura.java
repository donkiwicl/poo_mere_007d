package dev.rampmaster;

import java.util.ArrayList;
import java.util.List;

public class Asignatura {

  private String codigo;
  private String nombre;
  private List<Seccion> secciones;

  public Asignatura(String codigo, String nombre) {

    this.codigo = codigo;
    this.nombre = nombre;
    this.secciones = new ArrayList<>();
  }

  public void agregarSeccion(Seccion seccion) {

    this.secciones.add(seccion);

  }

}
