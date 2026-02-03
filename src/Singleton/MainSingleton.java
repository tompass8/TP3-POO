package Singleton;

public class MainSingleton {
    public static void main(String[] args) {
        TPE tpe1 = TPE.getInstance();
        tpe1.payer(15.50);
        tpe1.payer(23.75);

        TPE tpe2 = TPE.getInstance();
        tpe2.payer(9.99);

        System.out.println("Solde total du TPE : " + tpe1.getSolde() + "€");

        tpe1.cloturerJournee();
    }
}
