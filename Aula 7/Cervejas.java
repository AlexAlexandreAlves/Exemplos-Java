public class Cervejas {

    String fabricante;
    String tipo;
    int teoralcoolico;
    int temperatura;

    // Construtor

    public Cervejas(String fabricante, String tipo, int teoralcoolico, int temperatura) {

        this.fabricante = fabricante;
        this.tipo = tipo;
        this.teoralcoolico = teoralcoolico;
        this.temperatura = temperatura;

    }

    public void beber() {
        if (this.temperatura > 10){ 
            System.out.println("Choco!");

    }else{
        System.out.println("Trincando!");

    }
}

    public void nivelacool(int nivel) {
         if(nivel < this.teoralcoolico) {
        System.out.println("Só vou tomar pra encher o caneco!");
    } else {
        System.out.println("Ta boa demais!");
    }
}
}



