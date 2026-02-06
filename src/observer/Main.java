package observer;

public class Main {
    public static void main(String[] args) {
        BurgerFastRestaurant burgerFastParis = new BurgerFastRestaurant("BurgerFast Paris");

        ClientVIP client1 = new ClientVIP("Sotti", "sotti@gmail.com");
        ClientVIP client2 = new ClientVIP("Rock", "rock@yahoo.fr");
        ClientVIP client3 = new ClientVIP("Lucas", "lucas@hotmail.com");

        burgerFastParis.ajouterClientVIP(client1);
        burgerFastParis.ajouterClientVIP(client2);
        burgerFastParis.ajouterClientVIP(client3);

        Promotion promoMardi = new Promotion("MegaCheese", 50.0, "MARDI_FOU");

        burgerFastParis.lancerPromotionFlash(promoMardi);
    }
}