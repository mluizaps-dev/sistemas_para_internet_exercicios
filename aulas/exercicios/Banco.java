package aulas.exercicios;

public class Banco {
    public double saldo;
    public int numero;
    public int agencia;
    public String nome;

    public void status() {
        System.out.println("SUA CONTA: ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.printf("Saldo: %.2f\n", this.saldo);
    }

    public void conta(int a, int b, double c) {
        this.agencia = a;
        this.numero = b;
        this.saldo = c;
    }

    public double saldoConta() {
        return saldo;
    }

    public double saque(double valor) {
        double saldoTotal = saldo - valor;
        this.saldo = saldoTotal;
        return saldo;
    }

    public double deposito(double valor) {
        double saldoTotal = saldo + valor;
        this.saldo = saldoTotal;
        return saldo;
    }
}
