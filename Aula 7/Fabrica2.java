public class Fabrica2 {
    public static void main(String[] args) {
        Robo2 mrRobot = new Robo2("Optimus Prime", "Cargas Leves", 10, 100);
        Robo2 marombaRobot = new Robo2("Robo de Carga", "Cargas Pesadas", 100, 10);
        try {
            mrRobot.andar(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            marombaRobot.andar(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            mrRobot.levantarPeso(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            marombaRobot.levantarPeso(15);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}