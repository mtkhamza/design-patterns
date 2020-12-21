package state.states;

import state.Distributeur;
import state.State;

public class StateOff extends State {

    public StateOff(Distributeur distributeur){
        super(distributeur);
    }

    @Override
    public void on() {
        this.distributeur.setState(new StateOn(this.distributeur));
    }

    @Override
    public void off() {
    }


    @Override
    public void introduirePiece(int v) {

    }

    @Override
    public void getProduit() {
            System.out.println("getProduit not available !! - [from Off state]");
    }
}




