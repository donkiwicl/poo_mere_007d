package dev.rampmaster;

public class Seccion {

  private String codigoSeccion;
  private String docente;
  private Sala salaAsignada; // Relacion con sala

  public Seccion(String codigoSeccion, String docente, Sala salaAsignada) {

    this.codigoSeccion = codigoSeccion;
    this.docente = docente;
    this.salaAsignada = salaAsignada;

  }

}
