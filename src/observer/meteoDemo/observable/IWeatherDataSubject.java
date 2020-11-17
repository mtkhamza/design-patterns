package observer.meteoDemo.observable;

import observer.meteoDemo.observer.Observer;

public interface IWeatherDataSubject {
    public void subscribe(Observer observable);
    public void unsubscribe(Observer observable);
    public void notifyObservers();
}
