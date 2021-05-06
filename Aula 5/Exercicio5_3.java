import java.util.Scanner;

public class Exercicio5_3 {
public static void main(String[] parametros) {    
//* Crie um programa que leia 10 valores double e salve em um array, depois imprima esses valores

Scanner scanner = new Scanner (System.in);
    double[] array = new double[10];
    
    for (int i=0; i<10; i++) {                                
        System.out.println("Digite o próximo valor:");        
        array[i] = scanner.nextDouble();
    }

    for (double valor:array){
        System.out.println(valor);
    }

scanner.close();
}
}