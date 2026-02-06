package adapter;

import java.util.HashMap;
import java.util.Map;

public class CSVAdapter implements AnalyseurVentes {

    private LecteurCSV lecteur;

    public CSVAdapter(LecteurCSV lecteur) {
        this.lecteur = lecteur;
    }

    @Override
    public double getTotalVentes() {
        double total = 0;
        for (int i = 1; i < lecteur.getNbLignes(); i++) {
            total += calculerPrixLigne(i);
        }
        return total;
    }

    @Override
    public int getNbCommandes() {
        return lecteur.getNbLignes() - 1;
    }

    @Override
    public Map<String, Double> getCAParProduit() {
        Map<String, Double> rapport = new HashMap<>();

        for (int i = 1; i < lecteur.getNbLignes(); i++) {
            String[] colonnes = lecteur.getColonnes(i);

            String produit = colonnes[1];

            double prixLigne = calculerPrixLigne(i);

            rapport.merge(produit, prixLigne, Double::sum);
        }
        return rapport;
    }

    private double calculerPrixLigne(int indexLigne) {
        String[] colonnes = lecteur.getColonnes(indexLigne);
        String rawPrixQuantite = colonnes[2]; // ex: "8.50x3"

        String[] split = rawPrixQuantite.split("x");

        double prixUnitaire = Double.parseDouble(split[0]);
        int quantite = Integer.parseInt(split[1]);

        return prixUnitaire * quantite;
    }
}