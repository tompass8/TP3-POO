package Singleton;

public class TPE {
    private static TPE InstanceUnique = null;

    private double SoldeTotal ;

    private TPE() {
        this.SoldeTotal = 0;
        System.out.println(" demarage du TPE ");

    }
    public static TPE getInstance() {
        if (InstanceUnique == null) {
            InstanceUnique = new TPE();
        }
        return InstanceUnique;
    }

    public void payer (double montant) {
        this.SoldeTotal += montant;
        System.out.println(" Paiement accepté  " + montant + "€");
    }

        public double getSolde(){
            return this.SoldeTotal;

        }

        public void cloturerJournee(){
        System.out.println("cloture de la journée : solde total = " + this.SoldeTotal + "€");
        this.SoldeTotal = 0;
        }
}
