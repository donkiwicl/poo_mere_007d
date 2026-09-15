package dev.rampmaster;

public abstract class Usuario implements Colaborable {

    protected String nombre;
    protected String apellido;
    protected String correo;
    protected String run;

    public Usuario(String nombre, String apellido, String correo, String run) {

        this.nombre = nombre;

        this.apellido = apellido;

        this.correo = correo;

        this.run = run;

    }

    @Override
    public String toString(){
        return this.getCorreo();
    }

    public String getNombre() {

        return nombre;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public String getApellido() {

        return apellido;

    }

    public void setApellido(String apellido) {

        this.apellido = apellido;

    }

    public String getCorreo() {

        return correo;

    }

    public void setCorreo(String correo) {

        this.correo = correo;

    }

    public String getRun() {

        return run;

    }

    public void setRun(String run) {

        this.run = run;

    }

    @Override
    public void obtenerNombreApellido() {

        System.out.println("El nombre y apellido de usuario es:" + getNombre() + getApellido());

    }

    @Override
    public void obtenerInformacion() {

        System.out.println(("El correo y run del usuario son:" + getCorreo() + getRun()));

    }

    @Override

    public void usarJunaColaborador() {

        System.out.println("El usuario con run:" + getRun() + "Ocupa su tarjeta junaeb");

    }

}
