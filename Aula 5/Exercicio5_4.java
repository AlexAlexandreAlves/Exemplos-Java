import java.util.Scanner;

public class Exercicio5_4 {
public static void main(final String[] parametros) {
    // * Crie um programa que leia 10 valores int e salve em um array, depois
    // imprima se esses valores são pares ou impares

     Scanner scanner = new Scanner(System.in);
     
     int[] array = new int[10];
    for (int i=0; i < 10; i++) {
        System.out.println("Digite o próximo valor:");
        array[i] = scanner.nextInt();
    }

    for (final int valor : array) {
        System.out.println("O valor " + valor + " é " + (valor%2 == 0 ? " par " : " impar " ));
    }
scanner.close();

}
}