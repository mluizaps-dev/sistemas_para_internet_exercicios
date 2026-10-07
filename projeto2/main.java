package projeto2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Veiculo[] veiculos = new Veiculo[3];
        Veiculo veiculo = new Veiculo();
        FileWriter veic = new FileWriter("veic.txt", true);

        System.out.println("==========AUTO CENTER=========");
        System.out.println("1- Cadastrar veículo");
        System.out.println("2- Cadastrar cliente");
        System.out.println("3- Cadastrar ODS");
        System.out.println("4- Mostrar veiculos");
        System.out.println("5- Alterar telefone");
        System.out.println("6- Alterar endereço");
        System.out.println("7- Consultar nome do proprietário de um veículo");
        System.out.println("8- Consultar quantidade de serviços executados em um veículo");
        int res = sc.nextInt();

        // if (res == 1) {
        //      for (int i = 0; i < 3; i++) {
        //         veiculo.placa = sc.next();
        //         veiculo.marca = sc.next();
        //         veiculo.modelo = sc.next();
        //         veiculo.ano = sc.next();
        //         veiculos[i] = veiculo;
        // } else if (res == 4){
        //     for (int i = 0; i < 3; i++) {
        //             System.out.println("\nVeiculo " + (i + 1));
        //             System.out.println("Placa: " + veiculos[i].placa);
        //             System.out.println("Marca: " + veiculos[i].marca);
        //             System.out.println("Modelo: " + veiculos[i].modelo);
        //             System.out.println("Ano: " + veiculos[i].ano);
        //         }
        // }

        for (int i = 0; i < 3; i++) {
            veiculo.placa = sc.next();
            veiculo.marca = sc.next();
            veiculo.modelo = sc.next();
            veiculo.ano = sc.next();
            veiculos[i] = veiculo;
        }
    }
}
