package dev.rampmaster;

public class Docente extends Usuario implements Colaborable{
    public Docente(String nombre, String apellido, String correo, String run) {
        super(nombre, apellido, correo, run);
    }
    public void pasaLista(){
        System.out.println("El docente pasa la lista...");
    }

    @Override
    public int usarJunaColaborable() {
     return 45000;
    }
}

