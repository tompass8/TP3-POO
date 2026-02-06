package observer;

import java.util.ArrayList;
import java.util.List;

public class BurgerFastRestaurant {

    private List<ClientVIP> clientsVip;
    private String nomRestaurant;

    public BurgerFastRestaurant(String nomRestaurant) {
        this.nomRestaurant = nomRestaurant;
        this.clientsVip = new ArrayList<>();
    }



    public void ajouterClientVIP(ClientVIP client) {
        clientsVip.add(client);
        System.out.println("[INFO] Nouveau client VIP ajouté.");
    }


    public void retirerClientVIP(ClientVIP client) {
        clientsVip.remove(client);
    }


    public void lancerPromotionFlash(Promotion promotion) {
        System.out.println("\n " + nomRestaurant + " LANCE UNE PROMO FLASH ! ");
        notifierClients(promotion);
    }



    private void notifierClients(Promotion promotion) {
        for (ClientVIP client : clientsVip) {
            client.recevoirNotification(promotion);
        }
    }
}