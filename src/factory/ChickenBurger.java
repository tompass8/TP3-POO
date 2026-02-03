package factory;

public class ChickenBurger implements Burger {
    @Override
    public void preparer() {
        System.out.println(" Chicken : Pain burger, poulet pané croustillant, sauce BBQ.");
    }

    @Override
    public double getPrix() {
        return 9.0;
    }
}