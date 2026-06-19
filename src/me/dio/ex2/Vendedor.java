package me.dio.ex2;

public class Vendedor extends Contribuidor {

    private long quantidadeVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha);
        this.quantidadeVendas = 0;
        this.isAdmin = false;
    }

    public long getQuantidadeVendas() {
        return quantidadeVendas;
    }

    public void setQuantidadeVendas(long quantidadeVendas) {
        this.quantidadeVendas = quantidadeVendas;
    }

    public void realizarVenda(long qtdVendida) {
        this.quantidadeVendas += qtdVendida;
        if (qtdVendida > 1) {
            System.out.print("Venda realizada com sucesso! Quantidade atual de vendas: ");
        } else if (qtdVendida == 0) {
            System.out.print("Não há venda para realizar. Quantidade atual de vendas: ");
        } else {
            System.out.print("Vendas realizadas com sucesso! Quantidade atual de vendas: ");
        }
        System.out.println(this.quantidadeVendas);
    }

    public void consultarVendas() {
        System.out.println("O vendedor " + this.nome + " realizou " + this.quantidadeVendas + " vendas.");    }
}
