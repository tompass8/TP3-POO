package facade;

public class Main {
    public static void main(String[] args) {

        CommandeValidationFacade facade = new CommandeValidationFacade();

        facade.validerCommande("User1", "Burger", "Paris");
    }
}