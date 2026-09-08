package aulas;

public class Componentes {
    String name;
    String tipe;
    double value;
    int quantidadeDisponivel;

    public void quantDisp(int quantidade) {
        System.out.println(quantidade);
    }

    public void alterarValor(double novoValor) {
        this.value = novoValor;
    }

    public void produto() {
        System.out.println("Nome: " + this.name + "\nTipo: " + this.tipe + "\nValor: " + this.value
                + "\nQuantidade disponível: " + this.quantidadeDisponivel);
    }

    public void fazerPedido(int quantDesejada){
        if (quantDesejada <= this.quantidadeDisponivel){
            System.out.println("COMPLETO");
        } else {
            System.out.println("PARCIAL");
        }
    }

}
