package br.fiap.gs.model;

public class Alga extends RecursoMarinho {
    private double profundidade;

    public Alga(String especie, double quantidade, String data, double profundidade) {
        super(especie, quantidade, data);
        this.profundidade = profundidade;
    }

    public double getProfundidade() {return profundidade;}

    public void setProfundidade(double profundidade) {this.profundidade = profundidade;}

    public String toString() {
        return super.toString() + ", Profundidade: " + profundidade;
    }
}
