package state;

public abstract class State {
    protected Distributeur distributeur;

    public State(Distributeur distributeur){
        this.distributeur = distributeur;
    }

    public abstract void on();
    public abstract void off();
    public abstract void introduirePiece(int v);
    public abstract void getProduit();
}








