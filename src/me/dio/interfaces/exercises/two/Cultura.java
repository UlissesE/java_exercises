package me.dio.interfaces.exercises.two;

public class Cultura implements Produto {

    private String nome;
    private double valorBase;

    public Cultura(String nome, double valorBase) {
        this.nome = nome;
        this.valorBase = valorBase;
    }

    @Override
    public double calcularImposto() {
        return this.valorBase * 0.04;
    }

    @Override
    public String getNome() {
        return this.nome;
    }

    @Override
    public double getValorBase() {
        return this.valorBase;
    }
}
