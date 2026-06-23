package me.dio.inheritance.ex1;

public class IngressoFamilia extends Ingresso {

    private int numeroDePessoas;

    public IngressoFamilia(double valor, String nomeDoFilme, boolean dublado, int numeroDePessoas) {
        super(valor, nomeDoFilme, dublado);
        this.numeroDePessoas = numeroDePessoas;
    }

    @Override
    public double getValor() {
        double valorTotal = this.valor * this.numeroDePessoas;

        if (this.numeroDePessoas > 3) {
            valorTotal = valorTotal - (valorTotal * 0.05);
        }

        return valorTotal;
    }

}
