public class Contacorrente {

    String numerodaconta;
    String agencia;
    double saldo;
    String nometitular;

    public Contacorrente(String numerodaconta, String agencia, String nometitular){
        this.numerodaconta = numerodaconta;
        this.agencia = agencia;
        this.nometitular = nometitular; 
        this.saldo = 0;
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
