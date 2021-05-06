//Caracteristicas 

public class Remedio {
    String nome;
    String prazovalidade;
    int qtdecomprimidos;
    String composicao;

    public Remedio(String nome, String prazovalidade, int qtdecomprimidos, String composicao) {
        this.nome = nome;
        this.prazovalidade = prazovalidade;
        this.qtdecomprimidos = qtdecomprimidos;
        this.composicao = composicao;
    }   
    // Comportamentos

    public void qtdeReceitada(int qtdecomprimidos) throws Exception {
        if(this.qtdecomprimidos < qtdecomprimidos) {
            throw new Exception("Remedio não pode ser vendido.");

        }
        System.out.println("Remedio ok");
    }

    public boolean Validade() {
        if (Integer.parseInt(this.prazovalidade) < Integer.parseInt("20200926"))
        return false;

        return true;
    }

    
}