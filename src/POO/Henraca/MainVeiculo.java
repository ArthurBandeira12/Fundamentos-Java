package POO.Henraca;

public class MainVeiculo {
    public static void main(String[] args) {
        Carro c1 = new Carro("Honda", "Civic", 0, 4);
        Moto m1 = new Moto("Honda", "CB300", 0, true );
        Moto m2 = new Moto("Honda", "pop100", 0, false );

        c1.acelerar();
        m1.acelerar();
        m2.acelerar();

        System.out.println(c1.velocidadaAtual);
        System.out.println(m1.velocidadaAtual);
        System.out.println(m2.velocidadaAtual);
    }

}
