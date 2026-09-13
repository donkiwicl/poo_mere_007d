package dev.rampmaster;

public class Seccion {
    private String identificador;
    private  int promedio;
    private int procetanjeAprob;

    public Seccion(String identificador, int promedio, int procetanjeAprob){
        this.identificador = identificador;
        this.promedio = promedio;
        this.procetanjeAprob = procetanjeAprob;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public int getProcetanjeAprob() {
        return procetanjeAprob;
    }

    public void setProcetanjeAprob(int procetanjeAprob) {
        this.procetanjeAprob = procetanjeAprob;
    }
}
