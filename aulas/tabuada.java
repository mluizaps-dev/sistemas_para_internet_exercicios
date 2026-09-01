package aulas;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int numero, contador;

        numero = leitura.nextInt();

        for (contador = 0; contador < numero; contador++){
            System.out.println("teste");
        }

        leitura.close();
    }
}
