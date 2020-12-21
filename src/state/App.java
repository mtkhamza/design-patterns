package state;

import state.state.Plane;
import state.state.PlaneImpl;
import state.state.differentStates.EnterTheGarage;
import state.state.differentStates.Land;
import state.state.differentStates.TakeOff;

public class App {
    public static void main(String[] args) {
        PlaneImpl plane = new PlaneImpl();
        plane.setState(new TakeOff(plane));
        plane.getState().doActivity();
        plane.setState(new EnterTheGarage(plane));
        plane.getState().doActivity();
    }
}
