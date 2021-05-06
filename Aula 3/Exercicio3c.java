import java.util.InputMismatchException;
import java.util.Scanner;

     public class Exercicio3c {
     public static void main( String[] args) {

//Crie um programa que receba o salário e diga o valor de imposto de renda conforme abaixo:

//Base                     | Alíquota
//---------                | ------
//Até 1.903,98             | Isento
//De 1.903,99 até 2.826,65 | 7,5%
//De 2.826,66 até 3.751,05 | 15%
//De 3.751,06 até 4.664,68 | 22,5%
//Acima de 4.664,68        | 27,5%

     double salario = 0;
     Scanner scanner = new Scanner(System.in);
     try{ 
        System.out.println("Digite um salario: ");
        salario = scanner.nextDouble();
     }catch (InputMismatchException exception) {
         System.out.println("Valor de salário invalido!");

     }  finally {
         scanner.close();
     }
     
     if(salario<= 1850.30) {
         System.out.println("Alquota é: Isento");
     }else if (salario<= 2789.25){
        System.out.println("Alquota é: 7,5%");
     }else if (salario<= 3653.05){
        System.out.println("Alquota é: 15%");
     }else if (salario<= 4500.05){
        System.out.println("Alquota é: 22,5%");
     }else {
     System.out.println("Alquota é: 27,5%");
    }
   
}
  
}