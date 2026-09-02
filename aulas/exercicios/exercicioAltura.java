package aulas.exercicios;

import java.util.Scanner;

public class exercicioAltura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double alturaInicial, tempoDeQueda, alturaFinal, g, velocidadeFinal;

        g = 9.8;
        alturaInicial = leitura.nextDouble();
        tempoDeQueda = leitura.nextDouble();
        velocidadeFinal = (g * tempoDeQueda);

        alturaFinal = (alturaInicial - 0.5 * g * (tempoDeQueda*tempoDeQueda));
        System.out.printf("Altura final: %.1f\n", alturaFinal);
        System.out.printf("Velocidade do objeto: %.1f por segundos\n", velocidadeFinal);

        leitura.close();
    }
}
