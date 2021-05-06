public class Conveniencia {
    public static void main(String[] args) {

        Cervejas Heineken = new Cervejas("Heineken", "Amarga", 7, 12);
        Cervejas Budweiser = new Cervejas(" Budweiser", "Suave", 5, 9);

        Heineken.beber();
        Budweiser.beber();

        Heineken.nivelacool(6);
        Budweiser.nivelacool(7);
    }

}
