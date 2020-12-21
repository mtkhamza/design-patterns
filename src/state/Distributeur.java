package state;

import state.states.StateOff;


public class Distributeur {
    private State state;
    private int montant;

    public Distributeur() {
        this.state = new StateOff(this);
        this.montant = 0;
    }
    public int getMontant() {
        return montant;
    }
    public void setMontant(int montant) {
        this.montant = montant;
    }
    public void setState(State state) {
        this.state = state;
    }
    public State getState() {
        return state;
    }


    public void demarrer() {
        state.on();
    }
    public void introduirePiece(int v) {
        state.introduirePiece(v);
    }
    public void arreter() {
        state.off();
    }
    public void getProduit(){
        state.getProduit();
    }

}





