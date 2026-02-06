package adapter;

import java.util.Map;

public class BurgerAnalytics {
    private final AnalyseurVentes analyseur;

    public BurgerAnalytics(AnalyseurVentes analyseur) {
        this.analyseur = analyseur;
    }
    
    public void genererRapport() {
        System.out.printf("CA total: %.2f€%n", analyseur.getTotalVentes());
        System.out.println("Nb commandes: " + analyseur.getNbCommandes());
        for (Map.Entry<String, Double> entry : analyseur.getCAParProduit().entrySet()) {
            System.out.printf("%s: %.2f€%n", entry.getKey(), entry.getValue());
        }
    }
}
