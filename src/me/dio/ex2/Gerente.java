package me.dio.ex2;

public class Gerente extends Contribuidor {

    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha);
        this.isAdmin = true;
    }

    public void gerarRelatorioFinanceiro() {
        System.out.println("Gerando relatório financeiro...");
    }

    public void consultarVendas() {
        System.out.println("Consultando painel geral de vendas do time...");
    }
}
