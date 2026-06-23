package me.dio.interfaces.exercises.one;

public class Email implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("[E-mail] Disparando mensagem: " + mensagem);
    }
}
