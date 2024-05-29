package br.fiap.gs.model;

public class Peixe  extends RecursoMarinho{
    private double temperaturaAgua;

    public Peixe(String especie, double quantidade, String data, double temperaturaAgua) {
        super(especie, quantidade, data);
        this.temperaturaAgua = temperaturaAgua;
    }

    public double getTemperaturaAgua() {return temperaturaAgua;}

    public void setTemperaturaAgua(double temperaturaAgua) {this.temperaturaAgua = temperaturaAgua;}

    public String toString() {
        return super.toString() + ", Temperatura da Água: " + temperaturaAgua;
    }
}
