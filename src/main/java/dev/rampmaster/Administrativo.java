package dev.rampmaster;

public class Administrativo extends Usuario implements Colaborable {

        public Administrativo(String nombre, String apellido, String correo, String run) {
            super(nombre, apellido, correo, run);
        }

        int juna=45000;

        @Override
    public int usarJunaColaborable() {
            return juna;
            if (juna>=0){
                try
                System.out.println("No ")
            }
        }

}
