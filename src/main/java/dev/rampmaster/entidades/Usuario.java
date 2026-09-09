package dev.rampmaster.entidades;

public abstract class Usuario {
    protected String nombre;
    protected String apellido;
    protected String email;
    protected String rut;
    protected boolean estado;

    public Usuario(String nombre, String apellido, String email, String rut) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.rut = rut;
        this.estado = true;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getEmail() {
        return email;
    }

    public String getRut() {
        return rut;
    }

    public boolean isEstado() {
        return estado;
    }
    public void SetEstado(String cambiar) {
        if (cambiar.equals("Activo")) {
            this.estado = true;
        }
        else if (cambiar.equals("Inactivo")) {
            this.estado = false;
        }
    }

    public abstract void detalleUser();
}
