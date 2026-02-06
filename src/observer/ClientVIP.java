package observer;

public class ClientVIP {
    private String nom;
    private String email;

    public ClientVIP(String nom, String email) {
        this.nom = nom;
        this.email = email;
    }


    public void recevoirNotification(Promotion promotion) {
        System.out.println(" EMAIL envoyé à " + email + " (" + nom + ") :");
        System.out.println("   >> NOUVELLE PROMO FLASH : " + promotion.getDetails());
    }
}