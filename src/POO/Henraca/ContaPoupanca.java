package POO.Henraca;

//treinando heranca
public class ContaPoupanca extends ContaHenranca {

    public static final double rendimento = 0.02;

    public ContaPoupanca(ContaHenranca ch) {
        super(ch.getNumero(), ch.getSaldo(), ch.getTitular());


    }




    public void aplicarRendimento(){
       this.saldo+= this.saldo * rendimento;
    }

    @Override
    public void exibirSaldo(){
        System.out.println("Saldo Poupança: R$ " + saldo + " (Rendimento de 2%)");
    }
}
