import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio3b {
    public static void main( String[] args) {
        //Verificando se duas Strings são iguais;

String string1 = "";
String string2 = "";
Scanner scanner = new Scanner(System.in);

try { 
    System.out.print("Digite a primeira string");
    string1 = scanner.next();
    System.out.print("Digite a segunda string");
    string2 = scanner.next();

    } catch (InputMismatchException exception) { 
    System.out.println("Valores inválidos informados.");
string1 = "";
string2 = "";
}finally { 
    scanner.close();
}

System.out.print("Os valores das strings são " + (string1.equals(string2) ? "iguais" : "diferentes"));
}
}




    


        
    






