package me.dio.interfaces.exercises.two;

public class SaudeBemEstar implements Produto {

    private final String nome;
    private final double valorBase;

    public SaudeBemEstar(String nome, double valorBase) {
        this.nome = nome;
        this.valorBase = valorBase;
    }

    @Override
    public double calcularImposto() {
        return this.valorBase * 0.015;
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
