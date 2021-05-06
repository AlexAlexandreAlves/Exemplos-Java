public class Contacorrente {

    String numerodaconta;
    Agencia agencia;
    double saldo;
    String nometitular;

    public Contacorrente(String numerodaconta, Agencia agencia, String nometitular){
        this.numerodaconta = numerodaconta;
        this.agencia = agencia;
        this.nometitular = nometitular;     
        this.saldo = 0;

        agencia.addContacorrente(this);
    }

    public void deposito(double valor) {
        this.saldo += valor;
    }

    public void saque(double valor) {
        this.saldo -= valor;
    }

    public double saldoTotal() {
        return saldo;
    }
}
