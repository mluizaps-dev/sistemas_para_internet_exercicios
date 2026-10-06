package projeto2;

import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Veiculo veiculo = new Veiculo();
        String[] veiculos = new String[30];

        for(int i = 0; i < 30; i++){
            veiculo.placa = sc.next();
            veiculos[i] = veiculo.placa;
            veiculo.marca = sc.next();
            veiculos[i] = veiculo.marca;
            veiculo.modelo = sc.next();
            veiculos[i] = veiculo.modelo;
            veiculo.ano = sc.next();
            veiculos[i] = veiculo.ano;
        }
        System.out.println(Arrays.toString(veiculos));
    }
}
