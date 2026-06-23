package me.dio.interfaces.exercises.one;

import java.util.ArrayList;
import java.util.List;

public class DisparadorMarketing {

    private List<ServicoMensagem> canaisAtivos;

    public DisparadorMarketing() {
        this.canaisAtivos = new ArrayList<>();
    }

    public void adicionarCanal(ServicoMensagem servico) {
        this.canaisAtivos.add(servico);
    }

    public void enviarParaTodos(String mensagem) {
        System.out.println("Iniciando disparo de marketing para: " + canaisAtivos.size() + " canais... \n");

        for(ServicoMensagem servico : canaisAtivos) {
            servico.enviarMensagem(mensagem);
        }

        System.out.println("\nDisparo concluído");
    }
}
