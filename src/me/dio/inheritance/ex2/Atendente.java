package me.dio.inheritance.ex2;

public class Atendente extends Contribuidor {

    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha);
        this.valorEmCaixa = 0;
        this.isAdmin = false;
    }

    public void receberPagamento(double valorRecebido) {
        if (valorRecebido > 0){
            this.valorEmCaixa += valorRecebido;
            System.out.println("Pagamento de R$" + valorRecebido + " recebido. Novo saldo em caixa: R$" + this.valorEmCaixa);
        } else{
            System.out.println("Impossível receber o pagamento.");
        }
    }

    public void fecharCaixa() {
        System.out.println("Caixa fechado. Total arrecadado no turno: R$" + this.valorEmCaixa);
        this.valorEmCaixa = 0;
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }
}
