public class Robo2 {
    String nome;
    String funcao;
    int capacidadeTotal;
    int autonomia;

    public Robo2(String nome, String funcao, int capacidadeTotal, int autonomia) {
        this.nome = nome;
        this.funcao = funcao;
        this.capacidadeTotal = capacidadeTotal;
        this.autonomia = autonomia;
    }

    public void levantarPeso(int peso) throws Exception {
        if (peso > this.capacidadeTotal) {
            throw new Exception("Impossible!");
        }
        System.out.println("Easy!");
    }

    public void andar(int quilometros) throws Exception {
        if (this.autonomia < quilometros) {
            throw new Exception("Fail!");
        }
        System.out.println("Route completed!");
    }
}
