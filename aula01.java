import java.util.Scanner;

public class aula01 {
    public static void main(String[] args) {

        Scanner teste = new Scanner(System.in);
        Caneta c1 = new Caneta();

        c1.cor = "Azul";
        c1.carga = 10;
        c1.modelo = "BIC";
        c1.ponta = 0.5f;
        c1.tampada = false;

        // System.out.println("Cor da caneta: ");
        // c1.cor = teste.nextLine();

        // System.out.println("Carga: ");
        // c1.carga = teste.nextInt();

        // System.out.println("Modelo da caneta: ");
        // c1.modelo = teste.nextLine();

        // System.out.println("Ponta da caneta: ");
        // c1.ponta = teste.nextFloat();

        // System.out.println("A caneta está tampada?: ");
        // c1.tampada = teste.nextBoolean();

        c1.status();
        c1.tampar();
        c1.estaTampado();
        teste.close();
    }
}
