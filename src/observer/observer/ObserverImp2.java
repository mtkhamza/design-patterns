package observer.observer;

public class ObserverImp2 implements Observer {

    private double lastState;

    @Override
    public void update(int state) {
        if(state - lastState > 0){
            System.out.println("Observer 2 = Pression");
        }else if(state - lastState < 0){
            System.out.println("Observer 2 = Depression");
        }else{
            System.out.println("Observer 2 = Stability");
        }
        lastState = state;
    }
}
