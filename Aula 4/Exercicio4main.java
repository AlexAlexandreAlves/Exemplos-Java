
    public class Exercicio4main{ 
    public static void main( String[] parametros) {

        // Lendo numeros na main

try{
String param1 = parametros[0];
String param2 = parametros[1];

int numero1 = Integer.parseInt(param1);
int numero2 = Integer.parseInt(param2);

System.out.println(numero1 + " + " + numero2 + " = " + (numero1 + numero2));
System.out.println(numero1 + " + " + numero2 + " = " + (numero1 - numero2));
System.out.println(numero1 + " + " + numero2 + " = " + (numero1 * numero2));
System.out.println(numero1 + " + " + numero2 + " = " + (numero1 / numero2));
} catch (Exception exception) {
    System.out.println(exception.getMessage());
}

}
        
}

        