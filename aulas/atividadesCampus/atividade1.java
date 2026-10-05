package aulas.atividadesCampus;

import java.util.Scanner;

public class atividade1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tempoSeparacao, tempoVoltaPrimeiro, tempoVoltaUltimo, quantidadeVoltas, voltas1, voltas2;

        tempoSeparacao = sc.nextInt();
        tempoVoltaPrimeiro = sc.nextInt();
        tempoVoltaUltimo = sc.nextInt();
        quantidadeVoltas = sc.nextInt();
        voltas1 = 0;
        voltas2 = 0;

        while (voltas1 - voltas2 < 1){
            voltas1++;
        }

        // int tempoUltimoFrente = tempoSeparacao/tempoVoltaUltimo;
        // int diferenca = tempoSeparacao + (tempoVoltaUltimo - tempoVoltaPrimeiro);

        // if (tempoVoltaPrimeiro > tempoVoltaUltimo) {
        //     System.out.println("ERRO! O tempo do primeiro deve ser menor que o último.");
        // } else {
        //     System.out.println("Teste");
        // }

        sc.close();
    }
}
