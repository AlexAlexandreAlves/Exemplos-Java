public class Farmacia {
    public static void main(String[] args) {
   
        Remedio dipirona = new Remedio("Amoxilina", "20200516",15,"dipirona + cafeina");
        Remedio paracetamol = new Remedio("Paracetamol", "20130215",15,"dipirona + cafeina");

        try{
            dipirona.qtdeReceitada(30);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try{
            paracetamol.qtdeReceitada(30);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

}
