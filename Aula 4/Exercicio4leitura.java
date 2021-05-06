import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
     
public class Exercicio4leitura{ 


    public static void main(String[] parametros) {
        //Lendo as linhas no arquivo de texto
    
        try{
            BufferedReader buffer = new BufferedReader(new FileReader("tabuada.txt"));
            String line = "";
        do {
            System.out.println(line);
            line = buffer.readLine();
        } while (line != null);
        buffer.close();
        } catch (IOException exception) {
            System.out.println(exception.getMessage());
        }
    
    }
    }