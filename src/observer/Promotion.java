package observer;

public class Promotion {
    private String nomBurger;
    private double reduction; // En pourcentage (ex: 50.0 pour -50%)
    private String codePromo;

    public Promotion(String nomBurger, double reduction, String codePromo) {
        this.nomBurger = nomBurger;
        this.reduction = reduction;
        this.codePromo = codePromo;
    }

    public String getDetails() {
        return "- " + reduction + "% sur le " + nomBurger + " (Code: " + codePromo + ")";
    }
}