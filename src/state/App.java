package state;


public class App {
    public static void main(String[] args) {
       Distributeur distributeur = new Distributeur();
       distributeur.demarrer();
       distributeur.getProduit();
       distributeur.introduirePiece(5);
       distributeur.introduirePiece(6);
       distributeur.getProduit();
       distributeur.arreter();

    }
}
