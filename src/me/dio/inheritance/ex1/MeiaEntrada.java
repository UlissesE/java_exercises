package me.dio.inheritance.ex1;

public class MeiaEntrada extends Ingresso {

    public MeiaEntrada(double valor, String nomeDoFilme, boolean dublado) {
        super(valor, nomeDoFilme, dublado);
    }

    @Override
    public double getValor() {
        return this.valor / 2.0;
    }
}
