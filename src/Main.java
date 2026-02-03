public class Main {
    public static void main(String[] args) {

        Sandwich monDejeuner = new SandwichBuilder("Complet")
                .ajouterViande("Poulet")
                .ajouterFromage("Cheddar")
                .ajouterSauce("Mayo")
                .avecSalade(true)
                .build();

        Sandwich simple = new SandwichBuilder("Baguette")
                .ajouterViande("Jambon")
                .build();

        System.out.println("** Commande 1 **");
        System.out.println(monDejeuner);

        System.out.println("\n** Commande 2 **");
        System.out.println(simple);
    }
}