package state.state;

public interface Plane {
    void leaveTheGarage(); // change of state method
    void enterTheGarage(); // change of state method
    void takeOff(); // change of state method
    void land(); // change of state method
    void doActivity();
}
