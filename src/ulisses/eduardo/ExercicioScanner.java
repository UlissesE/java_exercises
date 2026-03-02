package ulisses.eduardo;

import java.util.Scanner;

public class ExercicioScanner {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a nota da prova semestral:");
        float ps = leitor.nextFloat();

        System.out.println("Digite a nota do trabalho de conclusão:");
        float tcc = leitor.nextFloat();

        System.out.println("Digite a nota da avaliação intermediária 1:");
        float ai1 = leitor.nextFloat();

        System.out.println("Digite a nota da avaliação intermediária 2:");
        float ai2 = leitor.nextFloat();

        float mediaAi = (ai1 + ai2)/2;
        double mediaFinal = ps * 0.5 + tcc * 0.3 + mediaAi * 0.2;

        if (mediaFinal >= 6){
            System.out.println("Passou de ano");
        }
        else if (mediaFinal >= 3) {
            System.out.println("Está em exame");
        }
        else {
            System.out.println("Reprovou direto.");
        }
    }
}
