import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio4tabuada{ 
public static void main( String[] parametros) {
    // Programa tabuada 
    Scanner scanner = new Scanner(System.in);
    int valor = 0;
    System.out.println("Digite o valor inicial para o calculo: ");
    try{
        valor = scanner.nextInt();
    }catch (InputMismatchException exception) {
        System.out.println("O valor digitado é invalido!");
    } 
    scanner.close();    

    try{ 
    BufferedWriter buffer = new BufferedWriter(new FileWriter("Tabuada.txt"));
    for (int i=0;i<=10;i++){
    
    buffer.append(valor  + " x "  + i + " = " + (valor*i));
    buffer.append("\n");
    
}buffer.close();

}catch ( IOException exception) {
System.out.println(".");
 
}   
}
}

