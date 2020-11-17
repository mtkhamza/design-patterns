package observer.observer;

public class ObserverImp3 implements Observer {

    @Override
    public void update(int state) {
        System.out.println("this is an update for Observer 3, and you can customise it");
    }
}



