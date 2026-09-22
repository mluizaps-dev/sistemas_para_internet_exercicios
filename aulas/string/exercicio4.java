package aulas.string;

import java.util.Scanner;

public class exercicio4 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String frase = sc.next();
    String c1 = sc.next();
    char caractere1 = c1.charAt(0);
    String c2 = sc.next();
    char caractere2 = c2.charAt(0);
    String resultado = "";

    for (int i = 0; i < frase.length(); i++) {
      if (frase.charAt(i) == caractere1) {
        resultado += caractere2;
        System.out.println(resultado);
      }
      else {
        System.out.println("ERRO");
      }
    }
  }
}
