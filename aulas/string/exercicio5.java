package aulas.string;

import java.util.Arrays;
import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tamanho lista 1: ");
        int tam1 = sc.nextInt();

        System.out.println("Tamanho lista 2: ");
        int tam2 = sc.nextInt();

        System.out.println("Tamanho lista 3: ");
        int tam3 = sc.nextInt();

        String[] lista1 = new String[tam1];
        String[] lista2 = new String[tam2];
        String[] lista3 = new String[tam3];

        for (int i = 0; i < lista1.length; i++) {
            System.out.println((i + 1) + " palavra da lista 1: ");
            String lista1Palavras = sc.next();
            lista1[i] = lista1Palavras;
        }
        System.out.println(Arrays.toString(lista1));

        for (int i = 0; i < lista2.length; i++) {
            System.out.println((i + 1) + " palavra da lista 2: ");
            String lista2Palavras = sc.next();
            lista2[i] = lista2Palavras;
        }
        System.out.println(Arrays.toString(lista2));

        for (int i = 0; i < lista3.length; i++) {
            System.out.println((i + 1) + " palavra da lista 3: ");
            String lista3Palavras = sc.next();
            lista3[i] = lista3Palavras;
        }
        System.out.println(Arrays.toString(lista2));

        int contador = 0;
        for (int i = 0; i < lista3.length; i++) {
            for (String letra : lista1) {
                System.out.println(letra);
                if (letra == lista3[i]) {
                    System.out.println(letra);
                     contador++;
                }
            }
            for (String letra : lista2) {
                if (letra == lista3[i]) {
                    contador++;
                }
            }
        }

        sc.close();
    }
}
