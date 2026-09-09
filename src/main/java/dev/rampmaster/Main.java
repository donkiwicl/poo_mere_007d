package dev.rampmaster;

import dev.rampmaster.entidades.Asignatura;
import dev.rampmaster.entidades.Estudiante;
import dev.rampmaster.entidades.Seccion;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Estudiante estudiante1 = new Estudiante("Javier", "Escanilla", "ja.escanillas@duocuc.cl", "21.918.384-4");
        Asignatura asignatura1 = new Asignatura(001, "Matematicas");
        Seccion seccion1 = new Seccion("MAT", "001", asignatura1);
        seccion1.setAsignatura(asignatura1);
        estudiante1.addSeccion(seccion1);
        estudiante1.detalleUser();
    }
}