package factory;

public class CheeseBurger implements Burger {
    @Override
    public void preparer() {
        System.out.println(" Cheeseburger : Pain sésame, steak haché, cheddar fondu.");
    }

    @Override
    public double getPrix() {
        return 10.0;
    }
}