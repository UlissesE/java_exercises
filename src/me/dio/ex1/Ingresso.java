package me.dio.ex1;

public class Ingresso {

    protected double valor;

    protected String nomeDoFilme;

    protected boolean dublado;

    public Ingresso() {

    }

    public Ingresso(double valor, String nomeDoFilme, boolean dublado) {
        this.valor = valor;
        this.nomeDoFilme = nomeDoFilme;
        this.dublado = dublado;
    }

    public void imprimirDetalhes() {
        String tipoAudio = dublado ? "Dublado" : "Legendado";
        System.out.printf("Filme: %s (%s)\n", nomeDoFilme, tipoAudio);
        System.out.printf("Valor real: %.2f\n", valor);
        System.out.printf("Valor a pagar: %.2f\n", getValor());
    }

    public double getValor() {
        return this.valor;
    }
}
