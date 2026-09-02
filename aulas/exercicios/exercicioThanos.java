package aulas.exercicios;

import java.util.Scanner;

public class exercicioThanos {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int horarioDeSaida, horarioDeSaidaMin, totalHorarioDeSaidaMin, horarioDeChegada, horarioDeChegadaMin,
                totalHorarioDeChegadaMin;

        System.out.println("Horário de saída da nave: ");
        horarioDeSaida = leitura.nextInt();
        horarioDeSaidaMin = leitura.nextInt();
        totalHorarioDeSaidaMin = ((horarioDeSaida * 60) + horarioDeSaidaMin);
        System.out.println(horarioDeSaida + "h" + horarioDeSaidaMin + "min");

        System.out.println("Horário de chegada da nave: ");
        horarioDeChegada = leitura.nextInt();
        horarioDeChegadaMin = leitura.nextInt();
        totalHorarioDeChegadaMin = ((horarioDeChegada * 60) + horarioDeChegadaMin);
        System.out.println(horarioDeChegada + "h" + horarioDeChegadaMin + "min");

        if ((totalHorarioDeChegadaMin - totalHorarioDeSaidaMin) >= (24 * 60)) {
            System.out.println("ERRO! Você demorou mais de 24 horas para chegar! Thanos está irritado.");
        } else {
            System.out.println("Tempo de espera: " + (totalHorarioDeChegadaMin - totalHorarioDeSaidaMin));
        }

        leitura.close();
    }
}
