public class estruturas_repetitivas {
    public static void main(String[] args) {
        int numero = 8;
        int teste = 0;

        for(int i = 0; i < numero; i++){
            System.out.println(i);
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        while(teste <= 10){
            System.out.println("número: " + teste);
            teste++;
        }

        do {
            System.out.println(numero);
        } while (teste <= 10);
    }
}
