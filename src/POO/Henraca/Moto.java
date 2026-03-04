package POO.Henraca;

public class Moto extends Veiculo {
    boolean temCilindradaAlta;


    public Moto(String marca, String modelo, int velocidadaAtual, boolean temCilindradaAlta) {
        super(marca, modelo, velocidadaAtual);
        this.temCilindradaAlta = temCilindradaAlta;
    }

    public boolean isTemCilindradaAlta() {
        return temCilindradaAlta;
    }

    @Override

    public void acelerar(){
        if(temCilindradaAlta){
            velocidadaAtual+=20;
        }else {
            super.acelerar();
        }
    }
}

