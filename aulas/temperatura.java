package aulas;

import java.util.Scanner;

public class temperatura {
    public static void main(String[] args) {
        double temperaturaCelsius, temperaturaKelvin, temperaturaFahrenheit;
        Scanner leitura = new Scanner(System.in);

        temperaturaCelsius = leitura.nextDouble();
        temperaturaKelvin = temperaturaCelsius + 273;
        temperaturaFahrenheit = (temperaturaCelsius * 1.8) + 32;

        System.out.println("Temperatura em celsius: " + temperaturaCelsius);
        System.out.println("Temperatura em kelvin: " + temperaturaKelvin);
        System.out.println("Temperatura em Fahrenheit: " + temperaturaFahrenheit);

        leitura.close();

    }
}
