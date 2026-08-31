package aulas;

import java.util.Scanner;

public class area {
    public static void main(String[] args) {
        double dimensao1, dimensao2;
        Scanner leitura = new Scanner(System.in);

        dimensao1 = leitura.nextDouble();
        dimensao2 = leitura.nextDouble();

        System.out.println("Área = " + (dimensao1 * dimensao2));
    }
}
