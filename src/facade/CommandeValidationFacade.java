package facade;

public class CommandeValidationFacade {
    private ServiceConnexion serviceConnexion;
    private ServiceStock serviceStock;
    private ServiceHoraires serviceHoraires;
    private ServiceLivraison serviceLivraison;
    private ServiceLocalisation serviceLocalisation;

    public CommandeValidationFacade() {
        // Initialisation des services
        this.serviceConnexion = new ServiceConnexion();
        this.serviceStock = new ServiceStock();
        this.serviceHoraires = new ServiceHoraires();
        this.serviceLivraison = new ServiceLivraison();
        this.serviceLocalisation = new ServiceLocalisation();
    }

    public void validerCommande(String idUtilisateur, String produit, String adresse) {
        System.out.println("----- DÉBUT DU TRAITEMENT DE LA COMMANDE -----");

        // Étape 1 : Connexion
        if (!serviceConnexion.verifierConnexion(idUtilisateur)) {
            System.out.println("ERREUR : Utilisateur non connecté.");
            return;
        }

        if (!serviceLocalisation.verifierAdresse(adresse)) {
            System.out.println("ERREUR : Adresse hors zone de livraison.");
            return;
        }
        if (!serviceHoraires.verifierOuverture()) {
            System.out.println("ERREUR : Le restaurant est fermé.");
            return;
        }

        if (!serviceStock.verifierIngredients(produit)) {
            System.out.println("ERREUR : Ingrédients manquants pour " + produit);
            return;
        }

        if (!serviceLivraison.trouverLivreur()) {
            System.out.println("ERREUR : Aucun livreur disponible.");
            return;
        }

        System.out.println(">> SUCCÈS : Commande validée et envoyée en cuisine !");
        System.out.println("----------------------------------------------");
    }
}


class ServiceConnexion {
    public boolean verifierConnexion(String idUser) {
        System.out.println("[1] ServiceConnexion : Vérification du token pour " + idUser + "...");
        return true;
    }
}

class ServiceStock {
    public boolean verifierIngredients(String produit) {
        System.out.println("[4] ServiceStock : Vérification du stock pour " + produit + "...");
        return true;
    }
}

class ServiceHoraires {
    public boolean verifierOuverture() {
        System.out.println("[3] ServiceHoraires : Vérification de l'heure actuelle...");
        return true;
    }
}

class ServiceLivraison {
    public boolean trouverLivreur() {
        System.out.println("[5] ServiceLivraison : Recherche d'un livreur à proximité...");
        return true;
    }
}

class ServiceLocalisation {
    public boolean verifierAdresse(String adresse) {
        System.out.println("[2] ServiceLocalisation : Calcul de la distance pour " + adresse + "...");
        return true;
    }
}