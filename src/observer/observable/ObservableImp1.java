package observer.observable;

import observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableImp1 implements Observable {

    private int state;
    private List<Observer> observers = new ArrayList<>();


    @Override
    public void subscribe(Observer observable) {
            observers.add(observable);
    }

    @Override
    public void unsubscribe(Observer observable) {
            observers.remove(observable);
    }

    @Override
    public void notifyObservers() {
        for(Observer o : observers){
            //Tech PUSH
            o.update(state);
        }
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }
}
