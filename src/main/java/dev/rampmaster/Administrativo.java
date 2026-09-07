package dev.rampmaster;

import dev.rampmaster.exception.SinFondoException;

public class Administrativo extends Usuario implements Colaborable{

    //ATRIBUTOS NUEVOS
    private String area;
    private int montoColacion;

    //CONSTRUCTOR
    public Administrativo(String nombre, String apellido, String correo, String run, String area) {
        super(nombre, apellido, correo, run);
        this.area = area;
        this.montoColacion = 0;
    }


    //GETTERS Y SETTERS NUEVOS
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    //METODOS DE COMPORTAMIENTOS NUEVOS
    @Override
    public void usarJunaColaborador(int valorAlmuerzo) {
        if (this.montoColacion <= 0 || valorAlmuerzo > this.montoColacion) {
            throw new SinFondoException("No hay plata.");
        }
        this.montoColacion = this.montoColacion - valorAlmuerzo;
        System.out.println("Colacion: " + valorAlmuerzo + " - saldo: " + this.montoColacion);

    }
}
