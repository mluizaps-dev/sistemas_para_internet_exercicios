package aulas.modularizacao;

import java.util.Scanner;

public class exercicioQuadrilha {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Quadrilha quadrilha = new Quadrilha();

        System.out.println("Ano inicial: ");
        quadrilha.anoInicial = leitura.nextInt();

        System.out.println("Quantidade de anos: ");
        quadrilha.quantidadeAnos = leitura.nextInt();

        int lista[] = new int[quadrilha.quantidadeAnos];

        for(int i = 0; i < quadrilha.quantidadeAnos; i++){
            System.out.println("Quantas pessoas foram a quadrilha de " + quadrilha.anoInicial++ + "?: ");
            lista[i++] = leitura.nextInt();
        }

        int menorPublico = lista[1] - lista[0];
        int anoMenor = 1;
        int i = 1;

        while (i < quadrilha.quantidadeAnos - 1) {
            if ((lista[i + 1] - lista[i]) < menorPublico) {
                menorPublico = lista[i + 1] - menorPublico;
                anoMenor = i+1;
            }
            i++;
        }

        System.out.println("O ano com menor crescimento é " + anoMenor);

        leitura.close();
    }
}
