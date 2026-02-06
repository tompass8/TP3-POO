package strategy;

public class LivraisonExpress implements StrategieLivraison {
    @Override
    public double calculerFraisDeLivraison(double distanceKm) {
        return 5.0 + (distanceKm * 1.5);
    }
}