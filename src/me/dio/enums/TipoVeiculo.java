package me.dio.enums;

public enum TipoVeiculo {

    Carro(10.00),
    Moto(5.00),
    Caminhao(20.00);

    private final double tarifaHora;

    TipoVeiculo(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public double calcularValor(int horas) {
        return this.tarifaHora * horas;
    }
}
