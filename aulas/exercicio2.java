package aulas;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        int energia, min;
        Scanner leitura = new Scanner(System.in);

        energia = leitura.nextInt();
        min = leitura.nextInt();
        
        double superHomem = (min * 60)/ 5 * 10;
        double energiaKilojoules = (energia - (superHomem * 12));

        System.out.println(superHomem);
        System.out.println(energiaKilojoules);
    }
}
