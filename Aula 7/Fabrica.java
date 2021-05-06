public class Fabrica {
    public static void main(String[] args) {
   
    Robo primeirorobo = new Robo("Xjyw", 15000, 15, "20200507");
   
    try {
        primeirorobo.ligar();
        } catch (Exception e) {
        System.out.println(e.getMessage());
        }
    }
}