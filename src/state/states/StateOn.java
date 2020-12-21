package state.states;

import state.Distributeur;
import state.State;

public class StateOn extends State {

    public StateOn(Distributeur distributeur){
        super(distributeur);
    }

    @Override
    public void on() {
        System.out.println("Distribution is On");
    }

    @Override
    public void off() {
        this.distributeur.setState(new StateOff(this.distributeur));
    }

    @Override
    public void introduirePiece(int v) {
        this.distributeur.setState(new StateDistibution(this.distributeur));
        this.distributeur.setMontant(this.distributeur.getMontant() + v);
    }

    @Override
    public void getProduit() {
        System.out.println("getProduit not available !!  - [from Off state]");
    }
}



