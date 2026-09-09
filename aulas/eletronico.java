package aulas;

import java.util.Scanner;

public class eletronico {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Componentes projeto1 = new Componentes();

        System.out.println("REGISTRO DE COMPONENTES");

        System.out.print("Nome: ");
        projeto1.name = leitura.next();
        System.out.print("Tipo: ");
        projeto1.tipe = leitura.next();
        System.out.print("Valor: ");
        projeto1.value = leitura.nextDouble();
        System.out.print("Quantidade disponível: ");
        projeto1.quantidadeDisponivel = leitura.nextInt();

        System.out.println("MENU:");
        System.out.println("1- Ver o produto.");
        System.out.println("2- Alterar valor.");
        System.out.println("3- Fazer um pedido.");
        System.out.println("4- Ver quantidade disponível.");
        System.out.println("5- Encerrrar sistema.");

        int resp = leitura.nextInt();

        while (resp != 5) {

            if (resp == 4) {
                projeto1.quantDisp(projeto1.quantidadeDisponivel);
            } else if (resp == 2) {
                System.out.println("Novo valor: ");
                double novoValor = leitura.nextDouble();
                projeto1.alterarValor(novoValor);
            } else if (resp == 1){
                projeto1.produto();
            } else if (resp == 3) {
                System.out.print("Qual a quantidade desejada?: ");
                int quantDesejada = leitura.nextInt();
                projeto1.fazerPedido(quantDesejada);
            }

            System.out.println("MENU:");
            System.out.println("1- Ver o produto.");
            System.out.println("2- Alterar valor.");
            System.out.println("3- Fazer um pedido.");
            System.out.println("4- Ver quantidade disponível.");
            System.out.println("5- Encerrrar sistema.");

            resp = leitura.nextInt();
        }

        System.out.println("PROGRAMA ENCERRADO!");

        leitura.close();

    }
}
