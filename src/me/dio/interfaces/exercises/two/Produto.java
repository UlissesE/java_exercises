package me.dio.interfaces.exercises.two;

public interface Produto {

    double calcularImposto();
    String getNome();
    double getValorBase();

    default void imprimirDetalhes() {
        System.out.println("Produto: " + getNome());
        System.out.println("Valor Base: " + getValorBase());
        System.out.println("Valor com Imposto: R$" + calcularImposto());
        System.out.println("Valor Total: R$" + (getValorBase() + calcularImposto()));
        System.out.println("-----------------");
    }
}
