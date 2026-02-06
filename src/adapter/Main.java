package adapter;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        creerFichierCSVTest();

        LecteurCSV lecteur = new LecteurCSV("ventes.csv");

        AnalyseurVentes adaptateur = new CSVAdapter(lecteur);

        BurgerAnalytics analytics = new BurgerAnalytics(adaptateur);

        System.out.println("=== RAPPORT BURGER FAST ===");
        analytics.genererRapport();
    }

    private static void creerFichierCSVTest() {
        String contenu = "date,produit,prix_quantite\n" +
                "2026-01-31,BurgerVeggie,8.50x3\n" +
                "2026-01-31,CheeseBurger,10.20x2\n" +
                "2026-02-01,ChickenBurger,9.75x5";
        try (FileWriter writer = new FileWriter("ventes.csv")) {
            writer.write(contenu);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}