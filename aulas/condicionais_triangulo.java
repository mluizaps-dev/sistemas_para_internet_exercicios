package aulas;

import java.util.Scanner;

public class condicionais_triangulo {
    public static void main(String[] args) {
        double a, b, c;

        Scanner leitura = new Scanner(System.in);

        a = leitura.nextDouble();
        b = leitura.nextDouble();
        c = leitura.nextDouble();

        if (a < (b + c) && b < (b + c) && c < (a + b)) {
            System.out.println("Triâgulo correto");
        } else if (a == b && a == c){
            System.out.println("Equilátero");
        } else if (a == b || b == c || c == a){
            System.out.println("Isoceles");
        }else {
            System.out.println("Escaleno");
        }

        leitura.close();
    }
}
