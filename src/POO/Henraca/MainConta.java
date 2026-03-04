package POO.Henraca;

//treinando heranca
public class MainConta {

    public static void main(String[] args) {
        ContaHenranca ch = new ContaHenranca(12, 1500, "Arthur");

        ContaPoupanca ctp = new ContaPoupanca(ch);

        ctp.sacar(500);

        ctp.exibirSaldo();

        ctp.depositar(600);


        ctp.exibirSaldo();

        ctp.aplicarRendimento();

        ctp.exibirSaldo();


    }
}
