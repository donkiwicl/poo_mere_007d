package dev.rampmaster.entidades;

import java.util.ArrayList;
import java.util.List;

public class Seccion {
    private String nombre;
    private String codigo;
    private List<Estudiante> estudiantes = new ArrayList<>();
    private List<Docente> docentes = new ArrayList<>();
    private Asignatura asignatura;

    public Seccion(String nombre, String codigo, Asignatura asignatura) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.asignatura = asignatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public List<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(List<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public List<Docente> getDocentes() {
        return docentes;
    }

    public void setDocentes(List<Docente> docentes) {
        this.docentes = docentes;
    }

    public Asignatura getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(Asignatura asignatura) {
        this.asignatura = asignatura;
    }

    public void addEstudiante(Estudiante estudiante){
        this.estudiantes.add(estudiante);
        estudiante.addSeccion(this);
    }

    public void addDocente(Docente docente){
        this.docentes.add(docente);
        docente.addSeccion(this);
    }

    public void addAsignatura(Asignatura asignatura){
        this.asignatura = asignatura;
        asignatura.addSeccion(this);
    }

    public void detalles(){
        System.out.println("=== detalles ===");
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Codigo: " + this.codigo);
        System.out.println("Estudiantes: " + this.estudiantes);
        System.out.println("Docentes: " + this.docentes);
        System.out.println("Asignatura: " + this.asignatura);
    }
}
