package state.state;

import state.State;
import state.state.differentStates.Land;

public class PlaneImpl {



    private State state;

    public void setState(State state) {
        this.state = new Land(this);
    }

    public State getState() {
        return state;
    }

    //    @Override
//    public void leaveTheGarage() {
//
//    }
//
//    @Override
//    public void enterTheGarage() {
//
//    }
//
//    @Override
//    public void takeOff() {
//
//    }
//
//    @Override
//    public void land() {
//
//    }
//
//    @Override
//    public void doActivity() {
//
//    }
}
