package aulas;

import java.util.Scanner;

public class mediaNotas {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double nota1, nota2;

        nota1 = leitura.nextDouble();
        nota2 = leitura.nextDouble();

        while (nota1 > 0 && nota2 > 0) {
            System.out.println("Média: " + ((nota1 + nota2) / 2));
            break;
            
        }
        
        leitura.close();
    }
}
