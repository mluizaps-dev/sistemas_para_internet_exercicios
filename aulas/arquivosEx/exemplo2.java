package aulas.arquivosEx;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class exemplo2 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner ler = new Scanner(System.in);
        String nome, email;
        int dia, mes;

        FileOutputStream arq = new FileOutputStream("agenda.data");
        DataOutputStream gravarArq = new DataOutputStream(arq);

        for (int indice = 0; indice < 10; indice++) {
            System.out.println("Informe o nome: ");
            nome = ler.nextLine();

            System.out.println("Informe o email: ");
            email = ler.nextLine();

            System.out.println("\nInforme a data de aniversário: ");
            dia = ler.nextInt();
            mes = ler.nextInt();

            // gravarArq.writeUTF(nome);

        }
    }
}
