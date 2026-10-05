package aulas.atividadesCampus;

public class SomaDigitos {
    int numero, soma;

    public int somaDig(){
         while (numero / 10 > 0) {
            soma+=numero % 10;
            numero = numero/ 10;
        }
        return soma +=numero;
    }

    public void retornarRes(int numeroAuxiliar){
        if (numeroAuxiliar % soma == 0) {
            System.out.println(numeroAuxiliar % soma + " SIM");
        } else {
           
            System.out.println((numeroAuxiliar % soma) + " NÃO");
        }
    }
}
