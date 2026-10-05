package aulas.atividadesCampus;

import java.util.Arrays;
import java.util.Scanner;

public class atividade6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int[] A = new int[5];
        int[] B = new int[5];
        int[] uniao = new int[num];

        for (int i = 0; i < 5; i++){
            A[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(A));

        for (int i = 0; i < 5; i++){
            B[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(B));
    }
}
