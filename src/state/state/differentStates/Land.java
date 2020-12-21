package state.state.differentStates;

import state.State;
import state.state.PlaneImpl;

public class Land extends State {

    public Land(PlaneImpl plane) {
        super(plane);
    }

    @Override
    public void leaveTheGarage() {
        System.out.println("# Impossible !!");
    }

    @Override
    public void enterTheGarage() {
        System.out.println("# Transition from taking off ==> entering garage");
        plane.setState(new EnterTheGarage(plane));
    }

    @Override
    public void takeOff() {
        System.out.println("# Transition from taking off ==> entering garage");
        plane.setState(new TakeOff(plane));
    }

    @Override
    public void land() {
        System.out.println("# Impossible, already landed !!");
    }

    @Override
    public void doActivity() {
        System.out.println("### Activity : Landing");
    }
}
