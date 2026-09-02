package aulas.exercicios;

import java.util.Scanner;

public class exercicioBanco {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        Banco banco = new Banco();

        System.out.print("Nome: ");
        banco.nome = leitura.nextLine();

        System.out.print("Agência: ");
        banco.agencia = leitura.nextInt();

        System.out.print("Número: ");
        banco.numero = leitura.nextInt();

        System.out.print("Saldo: ");
        banco.saldo = leitura.nextDouble();

        banco.status();

        System.out.println("O que você quer fazer?: ");
        System.out.println("a) Saldo");
        System.out.println("b) Deposito");
        System.out.println("c) Ver minha conta");
        String resposta = leitura.nextLine();
    

        leitura.close();
    }
}
