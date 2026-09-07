package dev.rampmaster.clases_sistema;

import dev.rampmaster.utils.ValidadorRut;

public class Usuario {

    // Atributos
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String run;

    // Constructores
    public Usuario(String nombre, String apellido, String email, String run) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.run = run;
    }

    // Getters
    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getEmail() {
        return this.email;
    }

    public String getRun() {
        return this.run;
    }

    // Setters
    public void setNombre(String nombre) throws IllegalArgumentException {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        } else {
            this.nombre = nombre;
        }
    }

    public void setApellido(String apellido) throws IllegalArgumentException {
        if (apellido == null || apellido.isBlank()) {
            throw new IllegalArgumentException("El apellido no puede estar vacío");
        } else {
            this.apellido = apellido;
        }
    }

    public void setEmail(String email) throws IllegalArgumentException {
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("El email no puede estar vacío");
        } else {
            this.email = email;
        }
    }

    public void setRun(String run) {
        if (ValidadorRut.validar(run)) {
            this.run = run;
        }
    }

}
