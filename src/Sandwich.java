public class Sandwich {
    private final String pain;
    private final String viande;
    private final String fromage;
    private final String sauce;
    private final boolean salade;

    public Sandwich(SandwichBuilder builder) {
        this.pain = builder.pain;
        this.viande = builder.viande;
        this.fromage = builder.fromage;
        this.sauce = builder.sauce;
        this.salade = builder.salade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pain: ").append(pain);
        if (viande != null) {
            sb.append(", Viande: ").append(viande);
        }
        if (fromage != null) {
            sb.append(", Fromage: ").append(fromage);
        }
        if (sauce != null) {
            sb.append(", Sauce: ").append(sauce);
        }
        sb.append(", Salade: ").append(salade ? "oui" : "non");
        return sb.toString();
    }
}