package aulas.string;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String name = sc.next();
        int contadorVogais = 0;
        int contadorConsoantes = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == 'a' || name.charAt(i) == 'e' || name.charAt(i) == 'i' || name.charAt(i) == 'a'
                    || name.charAt(i) == 'o' || name.charAt(i) == 'u') {
                        contadorVogais++;
            } else {
                contadorConsoantes++;
            }
        }

        System.out.println(contadorVogais);
        System.out.println(contadorConsoantes);

        sc.close();
    }
}
