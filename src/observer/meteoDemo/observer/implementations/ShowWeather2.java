package observer.meteoDemo.observer.implementations;
import observer.meteoDemo.observable.IWeatherDataSubject;
import observer.meteoDemo.observable.Show;
import observer.meteoDemo.observer.Observer;

public class ShowWeather2 implements Observer, Show {

    private float humidity;
    private float pression;
    private float temperature;
    private IWeatherDataSubject weatherDataSubject;

    public ShowWeather2(IWeatherDataSubject weatherDataSubject) {
        this.weatherDataSubject = weatherDataSubject;
        weatherDataSubject.subscribe(this);
    }

    @Override
    public void show() {
        System.out.println("Pression actuelles : " + pression);
    }
    @Override
    public void refresh(float t, float h, float p) {
        this.temperature = t;
        this.humidity = h;
        this.pression = p;
    }
}
