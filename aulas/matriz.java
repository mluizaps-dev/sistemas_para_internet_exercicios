package aulas;

import java.util.Arrays;
import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int diagSec;
        int[][] matriz = {
            {90, 89, 87, 90},
            {12, 3, 7, 8},
            {12, 4, 78, 34},
            {43, 10, 88, 80}
        };
        int menor = matriz[0][0];
        System.out.println("Diagonal Secundaria: ");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                diagSec = matriz[i][4 - 1 - i];
                System.out.println(diagSec);
                if (matriz[i][j] < menor){
                    menor = matriz[i][j];
                }
            }
        }
        System.out.println("Diagonal Principal: ");
        System.out.println(matriz[0][0] + ", " + matriz[1][1] + ", " + matriz[2][2] + ", " + matriz[3][3]);
        System.out.println("Menor número: " + menor);
        System.out.println(Arrays.deepToString(matriz).replace("], ", "]\n"));
    }
}
