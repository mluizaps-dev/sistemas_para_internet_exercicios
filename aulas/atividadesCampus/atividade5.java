package aulas.atividadesCampus;

import java.util.Scanner;

public class atividade5 {
    public static void main(String[] args) {
        SomaDigitos somaDigitos = new SomaDigitos();
        Scanner sc = new Scanner(System.in);
        somaDigitos.numero = sc.nextInt();

        somaDigitos.soma = 0;
        int numeroAuxiliar = somaDigitos.numero;

        somaDigitos.somaDig();
        somaDigitos.retornarRes(numeroAuxiliar);

        // String intnumeroString = String.valueOf(somaDigitos.numero);
        // System.out.println(intnumeroString);
        // int somaTeste = 0;

        // for (int i = 0; i < intnumeroString.length(); i++) {
        //     somaTeste += intnumeroString.charAt(i) - 0;
        // }
        // System.out.println(somaTeste);

        sc.close();
    }
}
