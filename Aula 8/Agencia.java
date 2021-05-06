import java.util.ArrayList;

public class Agencia {
    String codigo;
    String endereco;
    String horarioAtendimento;
    ArrayList<Contacorrente> contas;

    public Agencia(String codigo, String endereco, String horarioAtendimento) {

        this.codigo = codigo;
        this.endereco = endereco;
        this.horarioAtendimento = horarioAtendimento;
        this.conta = new Arryalist<>();
    }

    public void addContacorrente(Contacorrente contas);

    {
        this.addContacorrente(conta);
    }

    public void imprimirContas() {
        System.out.println("As contas correntes são: ");
        for (Contacorrente contaCorrente : contas) {
            System.out.println(contaCorrente.numerodaconta + " - " + contaCorrente.nometitular);
        }
    }