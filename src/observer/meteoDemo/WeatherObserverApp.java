package observer.meteoDemo;

import observer.meteoDemo.observable.WeatherData;
import observer.meteoDemo.observer.implementations.ShowWeather1;
import observer.meteoDemo.observer.implementations.ShowWeather2;

public class WeatherObserverApp {
    public static void main(String[] args) {
        System.out.println("Weather Observer :");
        System.out.println("#######################################");
        WeatherData weatherData = new WeatherData();
        ShowWeather1 showWeather1 = new ShowWeather1(weatherData);
        ShowWeather2 showWeather2 = new ShowWeather2(weatherData);
        weatherData.setMesures(10,2,30);
        showWeather1.show();
        showWeather2.show();
        System.out.println("---------------------------------------");
        System.out.println("Mise a jour des donnees ");
        System.out.println("---------------------------------------");
        weatherData.setMesures(5,5,6);
        showWeather1.show();
        showWeather2.show();
    }
}
