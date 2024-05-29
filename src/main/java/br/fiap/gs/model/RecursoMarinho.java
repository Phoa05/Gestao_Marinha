package br.fiap.gs.model;

public class RecursoMarinho {
    private String especie;
    private double quantidade;
    private String data;

    public RecursoMarinho(String especie, double quantidade, String data) {
        this.especie = especie;
        this.quantidade = quantidade;
        this.data = data;
    }

    public String getEspecie() {return especie;}

    public void setEspecie(String especie) {this.especie = especie;}

    public double getQuantidade() {return quantidade;}

    public void setQuantidade(double quantidade) {this.quantidade = quantidade;}

    public String getData() {return data;}

    public void setData(String data) {this.data = data;}

    public String toString(){
        return "Espécie: " + especie + ", Quantidade: " + quantidade + ", Data: " + data;
    }
}
