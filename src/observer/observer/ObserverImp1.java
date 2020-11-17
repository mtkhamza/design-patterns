package observer.observer;

public class ObserverImp1 implements Observer {

    private double somme;

    @Override
    public void update(int state) {
        somme += state;
        System.out.println("Observer 1 sum = "+somme);
    }
}
