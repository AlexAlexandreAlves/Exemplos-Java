import java.util.InputMismatchException;
import java.util.Scanner;

     public class Exercicio3a {
     public static void main( String[] args) {
    //Criando um programa que tenha um ponto em string e convertendo para o valor inteiro;
        
        String variavel = "";
        Scanner scanner = new Scanner(System.in);
        
        try { 
            System.out.print("Digite um valor numerico com ponto:");
            variavel = scanner.next();
           } catch (InputMismatchException exception) { 
            System.out.println("Valore inválido informado.");
           }finally { 
            scanner.close();
        }
        try{ 
            double valorEmDouble = Double.parseDouble(variavel);
            int valorEmInteiro = (int) valorEmDouble;
            System.out.print("O valor em inteiro é: " + valorEmInteiro);
        } catch (NumberFormatException exception) {
            System.out.println("O valor informado não é um numero!");
        }
        }
        }
        




