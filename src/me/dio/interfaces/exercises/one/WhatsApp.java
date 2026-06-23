package me.dio.interfaces.exercises.one;

public class WhatsApp implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("[WhatsApp] Disparando mensagem: " + mensagem);
    }
}
