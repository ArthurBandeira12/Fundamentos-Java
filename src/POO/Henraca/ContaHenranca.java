package POO.Henraca;
//treinando heranca
public class ContaHenranca {
    protected int numero;
    protected double saldo;
    protected String titular;



    public ContaHenranca(int numero, double saldo, String titular){
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;


    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor;

    }

    public void sacar(double valor){
        if(valor > this.saldo){
            System.out.println("Nao possui limite suficiente");
        }
        else{
            this.saldo-=valor;
        }
    }

    public void exibirSaldo(){
        System.out.println(saldo);
    }


}
