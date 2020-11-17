package observer;


import observer.observable.ObservableImp1;
import observer.observer.Observer;
import observer.observer.ObserverImp1;
import observer.observer.ObserverImp2;
import observer.observer.ObserverImp3;

public class ObserverApp {
    public static void main(String[] args) {

        ObservableImp1 observable = new ObservableImp1();
        Observer observer1 = new ObserverImp1();
        Observer observer2 = new ObserverImp2();
        Observer observer3 = new ObserverImp3();


        observable.subscribe(observer1);
        observable.subscribe(observer2);
        observable.subscribe(observer3);

        observable.setState(70);
        System.out.println("=================");
        observable.setState(60);
        System.out.println("=================");
        observable.subscribe( observer -> System.out.println("Anonyme observer is in "));
        observable.setState(60);







    }
}
