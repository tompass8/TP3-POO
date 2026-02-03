package factory;

public class BurgerVeggie implements Burger {
    @Override
    public void preparer() {
        System.out.println(" Veggie : Pain complet, salade, tomate, carotte.");
    }

    @Override
    public double getPrix() {
        return 8.0;
    }
}