package strategy;

public class Main {
    public static void main(String[] args) {
        Commande c1 = new Commande(20.0, 10.0, new LivraisonExpress());
        c1.afficherDetails();

        Commande c2 = new Commande(35.50, 5.0, new LivraisonStandard());
        c2.afficherDetails();

        Commande c3 = new Commande(15.0, 0.5, new ClickAndCollect());
        c3.afficherDetails();

        System.out.println(">> Changement d'avis pour la commande 3 !");
        c3.setStrategieLivraison(new LivraisonExpress()); // Il a la flemme, il veut se faire livrer
        c3.afficherDetails();
    }
}