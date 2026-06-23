package me.dio.interfaces.exercises.two;

public class Alimentacao implements Produto {

    private final String nome;
    private final double valorBase;

    public Alimentacao(String nome, double valorBase) {
        this.nome = nome;
        this.valorBase = valorBase;
    }

    @Override
    public double calcularImposto() {
        return this.valorBase * 0.01;
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
