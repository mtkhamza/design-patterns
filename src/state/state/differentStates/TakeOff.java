package state.state.differentStates;

import state.State;
import state.state.PlaneImpl;

public class TakeOff extends State {

    public TakeOff(PlaneImpl plane) {
        super(plane);
    }

    @Override
    public void leaveTheGarage() {
        System.out.println("# Impossible !!");
    }

    @Override
    public void enterTheGarage() {
        System.out.println("# Impossible !!");
    }

    @Override
    public void takeOff() {
        System.out.println("# Impossible, already taking off !!");
    }

    @Override
    public void land() {
       plane.setState(new Land(plane));
    }

    @Override
    public void doActivity() {
        System.out.println("### Activity : Taking off");
    }
}