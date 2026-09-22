package aulas.string;

import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String expressao = sc.next();
        int contador = 0;
        boolean correto = false;

        for (int i = 0; i < expressao.length(); i++) {
            if (expressao.charAt(i) == '(') {
                contador++;
            } else if (expressao.charAt(i) == ')') {
                contador--;
            }
            if (contador < 0) {
                System.out.println("parenteses incorretos");
                correto = true;
            }
        }

        if (contador == 0 && correto == false) {
            System.out.println("parenteses corretos");
        } else {
            System.out.println("parenteses incorretos");
        }

        sc.close();
    }
}
