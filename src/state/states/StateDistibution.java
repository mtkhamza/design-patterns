package state.states;

import state.Distributeur;
import state.State;

public class StateDistibution extends State {

    public StateDistibution(Distributeur distributeur) {
        super(distributeur);
    }

    @Override
    public void on() {

    }

    @Override
    public void off() {
        this.distributeur.setState(new StateOff(this.distributeur));
        System.out.println("## rendre les pieces cumulées au client");
    }

    @Override
    public void introduirePiece(int v) {
        distributeur.setMontant(distributeur.getMontant() + v);
    }

    @Override
    public void getProduit() {
        System.out.println("++ getProduit treatment in distribution state ");
        this.distributeur.setState(new StateOn(this.distributeur));
        System.out.println("++ rendre les pieces cumulées au client :" + this.distributeur.getMontant());
    }
}
