package me.dio.inheritance.ex2;

public abstract class Contribuidor {

    protected String nome;

    protected String email;

    protected String senha;

    protected boolean isAdmin;

    public Contribuidor(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void realizarLogin() {
        System.out.println(this.nome + " realizou login no sistema.");
    }

    public void realizarLogoff() {
        System.out.println(this.nome + " saiu no sistema.");
    }

    public void alterarDados(String nome, String email) {
        this.nome = nome;
        this.email = email;
        System.out.println("Dados alterados com sucesso");
    }

    public void alterarSenha(String novaSenha) {
        this.senha = novaSenha;
        System.out.println("Senha alterada com sucesso");
    }

}
