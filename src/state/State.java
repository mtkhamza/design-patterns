package state;

import state.state.PlaneImpl;

public abstract class State {
    protected PlaneImpl plane;

    public State(PlaneImpl plane) {
        this.plane = plane;
    }

    public abstract void leaveTheGarage(); // change of state method
    public abstract void enterTheGarage(); // change of state method
    public abstract void takeOff(); // change of state method
    public abstract void land(); // change of state method
    public abstract void doActivity();
}
