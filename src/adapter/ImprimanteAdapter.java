package adapter;

public class ImprimanteAdapter implements Commande {

    private final Imprimante ancienneImprimante;

    public ImprimanteAdapter(Imprimante machine) {
        this.ancienneImprimante = machine;
    }

    @Override
    public void envoyer(String contenu) {
        ancienneImprimante.imprimer(contenu);
    }
}
