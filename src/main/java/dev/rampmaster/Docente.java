package dev.rampmaster;

public class Docente extends Usuario implements Colaborable {


    public Docente(String nombre, String apellido, String correo, String run) {


        super(nombre, apellido, correo, run);

    }

    @Override

    public void obtenerInformacion() {

        System.out.println("El correo y run del docente son: " + getCorreo() + " y " + getRun());

    }

    @Override

    public void obtenerNombreApellido() {

        System.out.println("El nombre y apellido del usuario son: " + getNombre() + " y " + getApellido());

    }

    @Override

    public void usarJunaColaborador() {

        System.out.println("El docente: " + getNombre() + " con run: " + getRun() + " hace uso de su tarjeta junaeb");

    }

}
