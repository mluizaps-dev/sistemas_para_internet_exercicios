package aulas.arquivosEx;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class exemplo1 {
    public static void main(String[] args) throws IOException { //Java, se acontecer um problema ao mexer nesse arquivo, avisa que esse método pode lançar uma exceção.
        String nome, celular;

        Scanner ler = new Scanner(System.in);

        FileWriter saida = new FileWriter("novaAgenda.txt"); // Quero escrever no arquivo notas.txt
        saida.write("Maria"); //Escreve Maria
        PrintWriter gravarSaida = new PrintWriter(saida); // Tem praticamente a mesma ideia de println

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o nome: ");
            nome = ler.nextLine();
            System.out.println("Informe o celular: ");
            celular = ler.nextLine();

            gravarSaida.println(nome + " - " + celular);
            gravarSaida.println("-----");
        }

        saida.close();
        ler.close();
    }
}
