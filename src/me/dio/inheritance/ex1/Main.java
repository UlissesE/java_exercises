package me.dio.inheritance.ex1;

public class Main {
    public static void main(String[] args) {
        // 1. Testando ingresso normal (Inteira)
        Ingresso ingressoInteira = new Ingresso(40.0, "O Senhor dos Anéis", true);
        System.out.println("--- INGRESSO NORMAL ---");
        ingressoInteira.imprimirDetalhes();

        System.out.println();

        // 2. Testando ingresso meia-entrada
        MeiaEntrada ingressoMeia = new MeiaEntrada(40.0, "Duna: Parte 2", false);
        System.out.println("--- MEIA ENTRADA ---");
        ingressoMeia.imprimirDetalhes();

        System.out.println();

        // 3. Testando ingresso família (Até 3 pessoas - sem desconto extra)
        IngressoFamilia familiaPequena = new IngressoFamilia(40.0, "Divertida Mente 2", true, 3);
        System.out.println("--- INGRESSO FAMÍLIA (3 Pessoas) ---");
        familiaPequena.imprimirDetalhes();

        System.out.println();

        // 4. Testando ingresso família (Mais de 3 pessoas - com desconto de 5%)
        // 40 * 4 = 160. Com 5% de desconto (8 reais), o valor deve ser 152.0.
        IngressoFamilia familiaGrande = new IngressoFamilia(40.0, "Kung Fu Panda 4", true, 4);
        System.out.println("--- INGRESSO FAMÍLIA (4 Pessoas - Com Desconto) ---");
        familiaGrande.imprimirDetalhes();
    }
}
