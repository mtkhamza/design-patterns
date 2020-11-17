package observer.observable;

import observer.observer.Observer;

public interface Observable {
    public void subscribe(Observer observable);
    public void unsubscribe(Observer observable);
    public void notifyObservers();
}



