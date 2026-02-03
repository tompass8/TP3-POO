public class SandwichBuilder {
    String pain;
    String viande;
    String fromage;
    String sauce;
    boolean salade;

    public SandwichBuilder(String pain) {
        this.pain = pain;
    }

    public SandwichBuilder ajouterViande(String viande) {
        this.viande = viande;
        return this;
    }

    public SandwichBuilder ajouterFromage(String fromage) {
        this.fromage = fromage;
        return this;
    }

    public SandwichBuilder ajouterSauce(String sauce) {
        this.sauce = sauce;
        return this;
    }

    public SandwichBuilder avecSalade(boolean salade) {
        this.salade = salade;
        return this;
    }

    public Sandwich build() {
        return new Sandwich(this);
    }
}
