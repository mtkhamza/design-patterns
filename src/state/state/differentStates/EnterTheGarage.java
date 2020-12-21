package state.state.differentStates;

import state.State;
import state.state.PlaneImpl;

public class EnterTheGarage extends State {

    public EnterTheGarage(PlaneImpl plane) {
        super(plane);
    }

    @Override
    public void leaveTheGarage() {
        plane.setState(new LeaveTheGarage(plane));
    }

    @Override
    public void enterTheGarage() {
        System.out.println("# Impossible, already in the garage !!");
    }

    @Override
    public void takeOff() {
        System.out.println("# Impossible !!");
    }

    @Override
    public void land() {
        System.out.println("# Impossible !!");
    }

    @Override
    public void doActivity() {
        System.out.println("### Activity : Inside The Garage");
    }


}
