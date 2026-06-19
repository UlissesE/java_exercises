package me.dio.ex2;

public class Main {
    public static void main(String[] args) {

        System.out.println("=== TESTANDO O SISTEMA DE USUÁRIOS ===");
        System.out.println();

        System.out.println("--- Cenário 1: Gerente ---");
        Gerente gerente = new Gerente("Carlos Henrique", "carlos@empresa.com", "senhaGerente123");

        gerente.realizarLogin();
        System.out.println("É administrador? " + (gerente.isAdmin ? "Sim" : "Não"));

        gerente.consultarVendas();
        gerente.gerarRelatorioFinanceiro();

        gerente.alterarSenha("Nova senha gerente.");
        gerente.realizarLogoff();
        System.out.println();

        System.out.println("--- Cenário 2: Vendedor ---");
        Vendedor vendedor = new Vendedor("Ana Paula", "anapaula@empresa.com", "senhaVendedor123");

        vendedor.realizarLogin();
        System.out.println("É Administrador? " + (vendedor.isAdmin() ? "Sim" : "Não"));

        vendedor.consultarVendas();
        vendedor.realizarVenda(10);
        vendedor.realizarVenda(2);
        vendedor.consultarVendas();

        vendedor.realizarLogoff();
        System.out.println();

        System.out.println("--- Cenário 3: Atendente ---");
        Atendente atendente = new Atendente("Lucas Silva", "lucassilva@empresa.com", "antendente123");

        atendente.realizarLogin();
        System.out.println("É administrador? " + (atendente.isAdmin ? "Sim" : "Não"));

        atendente.alterarDados("Lucas Silva Ramos", "lucas.ramos@empresa.com");

        System.out.println("Saldo inicial em caixa: R$ " + atendente.getValorEmCaixa());

        atendente.receberPagamento(12.23);
        atendente.receberPagamento(27.77);
        atendente.fecharCaixa();
        System.out.println("Saldo após fechamento: R$ " + atendente.getValorEmCaixa());

        atendente.realizarLogoff();
        System.out.println();

        System.out.println("=== FIM DOS TESTES ===");
    }


}