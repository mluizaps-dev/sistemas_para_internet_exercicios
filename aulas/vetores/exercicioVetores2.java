package aulas.vetores;

import java.util.Arrays;
import java.util.Scanner;

public class exercicioVetores2 {
    public static void main(String[] args) {
        int n, soma;

        Scanner leitura = new Scanner(System.in);
        n = leitura.nextInt();
        soma = 0;

        int vet[] = new int[n];
        for (int i = 0; i < n; i++) {
            vet[i] = leitura.nextInt();
        }

        System.out.println(Arrays.toString(vet));

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                soma = soma += vet[i];
            }
        }
        System.out.println(soma);

        leitura.close();

    }
}
