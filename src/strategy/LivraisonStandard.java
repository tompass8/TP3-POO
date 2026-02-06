package strategy;

public class LivraisonStandard implements StrategieLivraison {
    @Override
    public double calculerFraisDeLivraison(double distanceKm) {
        return 2.0 + (distanceKm * 0.5);
    }
}