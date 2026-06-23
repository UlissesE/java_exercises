package me.dio.interfaces.exercises.one;

public class RedesSociais implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("[Redes Sociais] Disparando mensagem: " + mensagem);
    }
}
