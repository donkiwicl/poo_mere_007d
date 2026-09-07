package dev.rampmaster;

public class Administrativo extends Usuario implements  Colaborable{
    private  String cargo;
    private  int sueldo;

    public Administrativo(String cargo, int sueldo, String nombre, String apellido, int run, String correo){
        super(nombre,apellido, run,  correo);
        this.cargo = cargo;
        this.sueldo = sueldo;
    }

    public String getCargo(){
        return  cargo;
    }
    public void setCargo( String nuevoCargo){
        this.cargo = nuevoCargo;
    }
    public int getSueldo(){
        return sueldo;
    }
    public  void setSueldo(int nuevoSueldo){
        this.sueldo = nuevoSueldo;
    }

    @Override
    public int consultarSaldo() {
        return 0;
    }
}
