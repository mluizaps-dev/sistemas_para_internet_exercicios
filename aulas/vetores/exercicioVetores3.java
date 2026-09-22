package aulas.vetores;

import java.util.Scanner;

public class exercicioVetores3 {
    public static void main(String[] args) {
        int quantidadeMedia;
        String nome1, nome2, nome3;
        double media1, media2, media3, soma1, soma2, soma3, somaDeTodosBlocos, porcentagemBloco3;

        Scanner leitura = new Scanner(System.in);

        media1 = 0;
        media2 = 0;
        media3 = 0;
        soma1 = 0;
        soma2 = 0;
        soma3 = 0;
        nome1 = "";
        nome2 = "";
        nome3 = "";

        System.out.println("Quantidade de pessoas: ");
        quantidadeMedia = leitura.nextInt();

        int[] bloco = new int[quantidadeMedia];

        for (int i = 0; i < 3; i++) {
            System.out.println("Qual o nome do bloco " + (i + 1) + ": ");
            if (i == 0) {
                nome1 = leitura.next();
                for (int i1 = 0; i1 < quantidadeMedia; i1++) {
                    bloco[i1] = leitura.nextInt();
                    soma1 = soma1 += bloco[i1];
                }
                media1 = soma1 / quantidadeMedia;
            }

            if (i == 1) {
                nome2 = leitura.next();
                for (int i2 = 0; i2 < quantidadeMedia; i2++) {
                    bloco[i2] = leitura.nextInt();
                    soma2 = soma2 += bloco[i2];
                }
                media2 = soma2 / quantidadeMedia;
            }

            if (i == 2) {
                nome3 = leitura.next();
                for (int i3 = 0; i3 < quantidadeMedia; i3++) {
                    bloco[i3] = leitura.nextInt();
                    soma3 = soma3 += bloco[i3];
                }
                media3 = soma3 / quantidadeMedia;
            }
        }
        System.out.println("Média bloco " + nome1 + ": " + media1);
        System.out.println("Média bloco " + nome2 + ": " + media2);
        System.out.println("Média bloco " + nome3 + ": " + media3);

        if (soma1 > soma2 && soma1 > soma3) {
            System.out.println("Maior número de pessoas: " + nome1 + " " + soma1);
        }

        else if (soma2 > soma1 && soma2 > soma3) {
            System.out.println("Maior número de pessoas: " + nome2 + " " + soma2);
        }

        else if (soma3 > soma2 && soma3 > soma1) {
            System.out.println("Maior número de pessoas: " + nome3 + " " + soma3);
        }

        somaDeTodosBlocos = soma1 + soma2 + soma3;

        porcentagemBloco3 = (soma3 / somaDeTodosBlocos) * 100;

        System.out.println("Porcentagem do bloco 3: " + porcentagemBloco3);

        leitura.close();

    }
}
