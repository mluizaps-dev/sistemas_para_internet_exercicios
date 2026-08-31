public class condicionais {
    public static void main(String[] args) {
        int numero = 5;

        if (numero > 8) {
            System.out.println("O número é maior que 8");
        }else {
            System.out.println("O número é menor que 8");
        }

        switch (numero) {
            case 5:
                System.out.println("O número é igual a 5");
                break;

            case 8:
                System.out.println("O número é igual a 8");

            default:
                System.out.println("Teste");
        }
    }
}
