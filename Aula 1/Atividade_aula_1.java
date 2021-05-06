public class Atividade_aula_1 {
    public static void main(String[] args) {
       // Crie um programa que calcule a média
       
        double num1 = 8;
        double num2 = 5;
        double num3 = 10;
       
        double media = (num1+num2+num3) / 3;
        
        System.out.println("A média das notas informadas é: " + String.format("%.2f",media));

       //Crie um programa que calcule a área  
   
        double lado1 = 20;
        double lado2 = 15;
        System.out.println("A Área referente aos lados informados é: " + (lado1 * lado2));

       //Crie um programa que calcule o volume

        double largura = 20;
        double altura = 15;
        double profundidade = 20;
        System.out.println("O volume referente aos dados informados é: " + (largura * altura* profundidade));

        //Crie um programa que avalie se um valor é maior do que o dobro de outro valor

        double valor1 = 2;
        double valor2 = 5;

        System.out.println( 
         valor1 > (valor2 *2) 
         ? " O valor 1 é maior que o dobro do valor2"
         : " O valor 1 não é maior que o dobro do valor 2"
        );

     









    }
 }