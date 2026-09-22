package aulas.vetores;

import java.util.Arrays;
import java.util.Scanner;

public class temperaturaVetores {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int totalPosicoes;
        totalPosicoes = leitura.nextInt();

        double maior, menor, mediana;
        double[] temp = new double[totalPosicoes];

        for (int i = 0; i < 10; i++) {
            temp[i] = leitura.nextDouble();
        }

        maior = temp[0];
        menor = temp[0];

        for (int i = 1; 1 < totalPosicoes; i++) {
            if (temp[i] < menor) {
                menor = temp[i];
            }
            if (temp[i] > maior) {
                maior = temp[i];
            }
        }

        Arrays.sort(temp);

        if (totalPosicoes % 2 == 0) {
            double meio = totalPosicoes / 2;
        }

        leitura.close();
    }
}
