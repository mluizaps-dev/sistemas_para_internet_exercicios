package aulas.vetores;

import java.util.Arrays;
import java.util.Scanner;

public class exercicioVerores1 {
    public static void main(String[] args) {

        int n, x, y;

        Scanner leitura = new Scanner(System.in);
        n = leitura.nextInt();

        int vet[] = new int[n];

        for (int i = 0; i < n; i++) {
            vet[i] = leitura.nextInt();
        }

        System.out.println(Arrays.toString(vet));

        x = leitura.nextInt();
        y = leitura.nextInt();

        System.out.println("Números ímpares: ");
        for (int i = x; i < y; i ++){
            if(vet[i] % 2 != 0){
                System.out.println(vet[i]);
            } else {
                System.out.println("INEXISTENTE");
            }
        }

        System.out.println(vet[x]);

        leitura.close();

    }
}
