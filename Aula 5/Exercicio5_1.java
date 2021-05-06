import java.util.Scanner;

public class Exercicio5_1 {
public static void main(String[] parametros) {
// * Crie um programa que questione a quantidade de notas a ser informada, receba-as e calcule a média.

Scanner scanner = new Scanner (System.in);
    System.out.println("Informe a quantidade de notas:");       
    int quantidade = scanner.nextInt();
    double[] notas = new double [quantidade];
    for (int i=0; i<quantidade; i++){
        System.out.println("Digite a próxima nota:");
        notas [i] = scanner.nextDouble();
    }
    double media = 0;
    for (double nota:notas){
        media += nota;
    }
    System.out.println("A media é: " + (media/quantidade));

scanner.close();
}
}