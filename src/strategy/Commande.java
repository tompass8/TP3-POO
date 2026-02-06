package strategy;

public class Commande {
    private double montantPlats;
    private double distanceKm;
    private StrategieLivraison strategieLivraison;

    public Commande(double montantPlats, double distanceKm, StrategieLivraison strategieLivraison) {
        this.montantPlats = montantPlats;
        this.distanceKm = distanceKm;
        this.strategieLivraison = strategieLivraison;
    }

    public double calculerPrixTotal() {
        double frais = strategieLivraison.calculerFraisDeLivraison(distanceKm);
        return montantPlats + frais;
    }

    public void afficherDetails() {
        double frais = strategieLivraison.calculerFraisDeLivraison(distanceKm);
        String nomStrategie = strategieLivraison.getClass().getSimpleName();

        System.out.println("--- Commande ---");
        System.out.println("Mode : " + nomStrategie);
        System.out.println("Plats : " + montantPlats + "€");
        System.out.printf("Frais : %.2f€ (pour %.1f km)%n", frais, distanceKm);
        System.out.printf("TOTAL : %.2f€%n", calculerPrixTotal());
        System.out.println();
    }

    public void setStrategieLivraison(StrategieLivraison nouvelleStrategie) {
        this.strategieLivraison = nouvelleStrategie;
    }
}