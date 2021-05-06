
public class Banco {
    public static void main(String[] args) {
        Contacorrente contaCorrenteUm = new Contacorrente("04896-3", "1234", "Kemily Teixeira");
      
        System.out.println("O saldo inicial é: R$ " + contaCorrenteUm.saldoTotal());
       
        contaCorrenteUm.deposito(5000);
        contaCorrenteUm.saque(2500);
        contaCorrenteUm.saque(175);
       
        System.out.println("O saldo atual é: R$ " + contaCorrenteUm.saldoTotal());
    }
}