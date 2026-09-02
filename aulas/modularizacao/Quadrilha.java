package aulas.modularizacao;

public class Quadrilha {
    public int anoInicial;
    public int quantidadeAnos;
    public int quantidadePessoas;

    public int anoComMaiorCrescimento(int i){
        int anoMaior = this.quantidadePessoas - i;
        return anoMaior;
    }
}
