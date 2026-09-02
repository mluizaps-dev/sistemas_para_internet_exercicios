package aulas.exercicios;

import java.util.Scanner;

public class exercicioTriangulo {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double a, b, c;

        a = leitura.nextDouble();
        b = leitura.nextDouble();
        c = leitura.nextDouble();

        if (a > (b - c) && a < (b + c) || b > (a - c) && b < (a + c) || c > (b - a) && c < (b + a)) {
            System.out.println("Formam triâgulo");
            if (a == b && b == c && a == c) {
                System.out.println("Seu triângulo é equilátero");
            }

            else if (a == b || b == c ||a == c) {
                System.out.println("Seu triângulo é isósceles");
            }

            else if (a != b && b != c && a != c) {
                System.out.println("Seu triângulo é escaleno");
            }

        } else {
            System.out.println("Não formam triângulo");
        }

        leitura.close();
    }
}
