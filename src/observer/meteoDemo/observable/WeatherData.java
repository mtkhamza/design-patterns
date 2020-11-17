package observer.meteoDemo.observable;
import observer.meteoDemo.observer.Observer;
import java.util.ArrayList;
import java.util.List;

public class WeatherData implements IWeatherDataSubject {

    private float humidity;
    private float pression;
    private float temperature;
    private List<Observer> observerList;
    public WeatherData() {
        observerList = new ArrayList();
    }
    @Override
    public void subscribe(Observer observer) {
        observerList.add(observer);
    }
    @Override
    public void unsubscribe(Observer observer) {
        if (observerList.indexOf(observer) >= 0)
            observerList.remove(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.refresh(temperature, humidity, pression);
        }
    }
    public void setMesures(float temperature, float humidity, float pression) {
        this.humidity = humidity;
        this.pression = pression;
        this.temperature = temperature;
        refreshMesures();
    }
    public void refreshMesures(){
        notifyObservers();
    }


}
