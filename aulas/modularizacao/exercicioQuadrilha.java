package aulas.modularizacao;

import java.util.Arrays;
import java.util.Scanner;

public class exercicioQuadrilha {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Quadrilha quadrilha = new Quadrilha();

        System.out.println("Ano inicial: ");
        quadrilha.anoInicial = leitura.nextInt();

        System.out.println("Quantidade de anos: ");
        quadrilha.quantidadeAnos = leitura.nextInt();

        for(int i = 0; i < quadrilha.quantidadeAnos; i++){
            System.out.println("Quantas pessoas foram a quadrilha de " + quadrilha.anoInicial++ + "?: ");
            int anoInicial = quadrilha.quantidadePessoas;
            int anoAtual = leitura.nextInt();
            int cresimento = anoAtual - anoInicial;
            System.out.println(cresimento);
            // System.out.println(quadrilha.quantidadePessoas);
        }

        // int lista[] = new int[quadrilha.quantidadeAnos];

        // for(int i = 0; i < quadrilha.quantidadeAnos; i++){
        //     System.out.println("Quantas pessoas foram a quadrilha de " + quadrilha.anoInicial++ + "?: ");
        //     quadrilha.quantidadePessoas = leitura.nextInt();
        //     lista[i] = quadrilha.quantidadePessoas;
        // }

        // System.out.println(Arrays.toString(lista));

        leitura.close();
    }
}
