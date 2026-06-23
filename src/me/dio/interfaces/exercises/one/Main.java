package me.dio.interfaces.exercises.one;

public class Main {
    public static void main(String[] args) {
        String campanhaPromocional = "Oferta imperdível! 50% de desconto em toda a loja usando o cupom JAVA50. Aproveite!";

        ServicoMensagem sms = new ServicoSMS();
        ServicoMensagem email = new Email();
        ServicoMensagem redesSociais = new RedesSociais();
        ServicoMensagem whatsapp = new WhatsApp();

        DisparadorMarketing disparador = new DisparadorMarketing();

        disparador.adicionarCanal(sms);
        disparador.adicionarCanal(email);
        disparador.adicionarCanal(redesSociais);
        disparador.adicionarCanal(whatsapp);

        disparador.enviarParaTodos(campanhaPromocional);
    }
}
