package me.dio.interfaces.exercises.two;

public class Main {
    public static void main(String[] args) {
        System.out.println("===CÁLCULO DE TRIBUTOS===\n");

        Produto arroz = new Alimentacao("Arroz 5kg", 35.0);
        Produto vitaminaC = new SaudeBemEstar("Vitamina C", 20.0);
        Produto camiseta = new Vestuario("Camiseta Nike", 100.0);
        Produto livro = new Cultura("1984", 20.0);

        arroz.imprimirDetalhes();
        vitaminaC.imprimirDetalhes();
        camiseta.imprimirDetalhes();
        livro.imprimirDetalhes();
    }
}
