package dev.rampmaster;

public class Administrativo extends Usuario implements Colaborable {


    public Administrativo(String nombre, String apellido, String correo, String run) {


        super(nombre, apellido, correo, run);

    }

    @Override
    public void obtenerInformacion() {

        System.out.println("El correo y run del usuario administrativo son: " + getCorreo() + " y " + getRun());

    }

    @Override
    public void obtenerNombreApellido() {

        System.out.println("El nombre y apellido del usuario administrativo son: " + getNombre() + " y " + getApellido());

    }

    @Override
    public void usarJunaColaborador() {

        System.out.println("El usuario administrativo: " + getNombre() + " con run: " + getRun() + " hace uso de su tarjeta junaeb");

    }

}
