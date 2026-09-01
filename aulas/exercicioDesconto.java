package aulas;

import java.util.Scanner;

public class exercicioDesconto {
    public static void main(String[] args) {
        double valor, desconto;
        Scanner leitura = new Scanner(System.in);

        valor = leitura.nextDouble();
        desconto = 91.0/100;

        System.out.println("Novo valor com desconto de R$9,00: " + (valor * desconto));

        leitura.close();
    }
}
