
     public class Exercicio2{
     public static void main(String[] args) {
     // Crie um programa que calcule _bhaskara_
        
     double a = 25;
     double b = -10;
     double c = -18;
     double delta = (b*b - 4*a*c);
     double x1 = (-b + Math.sqrt(delta)) / (2*a);
     double x2 = (-b - Math.sqrt(delta)) / (2*a);

     System.out.println("O valor de x1 é: " + String.format("%.2f",x1));
     System.out.println("O valor de x2 é: " + String.format("%.2f",x2));

        
      

    // Crie um programa que calcule a velocidade média de uma viagem
 
    double distanciakm = 3000;
    double tempoh = 50;
    double velocidade = (distanciakm / tempoh);
        
    System.out.println("A velocidade média da viagem é: " + (velocidade) + "Km/h"
         );
        
    // Crie um programa que calcule o percentual de imposto pago

    double faturamento = 50000;
    double ipi = 5000;
    double icms = 7000;
    double ipva = 750;
    double qtd_imposto = (ipi+icms+ipva);
    
    System.out.println(
    "O percentual de imposto a ser pago é de: " + (qtd_imposto * 100) / faturamento + "%"
     );
    

    //Crie um programa que teste se um valor é par ou ímpar

    double valor = 2;

    if (valor % 2 == 0 ){ 
    System.out.println("É par");}
    else { 
    System.out.println("É impar");
    }
    }
    }