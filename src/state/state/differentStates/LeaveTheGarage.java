package state.state.differentStates;

import state.State;
import state.state.PlaneImpl;

public class LeaveTheGarage extends State {

    public LeaveTheGarage(PlaneImpl plane) {
        super(plane);
    }

    @Override
    public void leaveTheGarage() {
        System.out.println("# Impossible, already left the garage !!");
    }

    @Override
    public void enterTheGarage() {
       plane.setState(new EnterTheGarage(plane));
    }

    @Override
    public void takeOff() {
        plane.setState(new TakeOff(plane));
    }

    @Override
    public void land() {

    }

    @Override
    public void doActivity() {
        System.out.println("### Activity : Leaving the garage");
    }
}