package POO.Henraca;

public class Carro extends Veiculo{
    int qtdPorta;


    public Carro(String marca, String modelo, int velocidadaAtual, int qtdPorta) {
        super(marca, modelo, velocidadaAtual);
        this.qtdPorta = qtdPorta;
    }

    public int getQtdPorta() {
        return qtdPorta;
    }


}
