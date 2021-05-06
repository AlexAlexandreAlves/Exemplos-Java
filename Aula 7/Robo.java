//Caracteristicas

public class Robo {
    
    String modelo;
    double peso;    
    double altura;
    String datafabricacao;
    boolean ligado = false;

    public Robo(String modelo, double peso, double altura, String datafabricacao) {

        this.modelo = modelo;
        this.peso = peso;
        this.altura = altura;
        this.datafabricacao = datafabricacao;
    }

    // Comportamentos

    public void ligar() throws Exception {
        if (ligado) {
            throw new Exception("Robo está ligado!");
        }
        ligado = true;
        System.out.println("Autobots rodar");
    }

    public void desligar() throws Exception {
        if (ligado) {
            throw new Exception("Robo está desligado!");
        }
        ligado = false;
        System.out.println("Off");
    }

}   