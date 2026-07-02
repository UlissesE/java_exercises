package me.dio.enums;

public class TesteEstacionamento {
    public static void main(String[] args) {
        TipoVeiculo carro = TipoVeiculo.Carro;
        double valorCarro = carro.calcularValor(3);
        System.out.printf("Carro (3h): R$ %.2f%n", valorCarro);

        TipoVeiculo moto = TipoVeiculo.Moto;
        double valorMoto = moto.calcularValor(5);
        System.out.printf("Moto (5h): R$ %.2f%n", valorMoto);

        TipoVeiculo caminhao = TipoVeiculo.Caminhao;
        double valorCaminhao = caminhao.calcularValor(24);
        System.out.printf("Caminhão (24h): R$ %.2f%n", valorCaminhao);
    }
}
