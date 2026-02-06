package strategy;

public class ClickAndCollect implements StrategieLivraison {
    @Override
    public double calculerFraisDeLivraison(double distanceKm) {
        return 0.0; // Gratuit, peu importe la distance
    }
}