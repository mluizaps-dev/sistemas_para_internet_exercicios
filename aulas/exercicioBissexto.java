package aulas;

import java.util.Scanner;

public class exercicioBissexto {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int ano;

        ano = leitura.nextInt();

        if (ano % 400 == 0 || ano % 4 == 0 && ano % 100 != 0) {
            System.out.println("BISSEXTO");
        } else {
            System.out.println("NÃO BISSEXTO");
        }

        leitura.close();
    }
}
