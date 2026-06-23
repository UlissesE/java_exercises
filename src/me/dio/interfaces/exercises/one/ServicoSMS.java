package me.dio.interfaces.exercises.one;

public class ServicoSMS implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("[SMS] Disparando mensagem:" + mensagem);
    }
}
