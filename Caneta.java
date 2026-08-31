public class Caneta {
    public String modelo;
    public String cor;
    public float ponta;
    public int carga;
    public boolean tampada;

    public void status(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Carga: " + this.carga);
        System.out.println("Tampada: " + this.tampada);
    }

    public void estaTampado(){
        if (this.tampada == true) {
            System.out.println("A caneta está tampada");
        }else {
            System.out.println("A caneta não está tampada");
        }
    }

    public void tampar() {
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

}