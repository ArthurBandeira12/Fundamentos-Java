package POO.Henraca;

public class Veiculo {
    String marca;
    String modelo;
    int velocidadaAtual;

    public Veiculo(String marca, String modelo, int velocidadaAtual){
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadaAtual = velocidadaAtual;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getVelocidadaAtual() {
        return velocidadaAtual;
    }

    public void acelerar(){
        velocidadaAtual +=10;
    }

    public void freiar(){
        if(velocidadaAtual > 0){
            velocidadaAtual -= 10;
        }
        else {
            System.out.println("O carro ja esta parado n tem como freiar mais");
        }
    }




}
