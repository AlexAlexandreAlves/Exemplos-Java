import java.util.Scanner;

public class Exercicio5_2 {
public static void main(String[] parametros) {
//* Crie um programa que imprima um arrays com Forech
    
Scanner scanner = new Scanner (System.in);     
    int[] array = {15, 9, 14, 8,};
    for (int valor:array){
        System.out.println(valor);
    }

scanner.close();
    }
}