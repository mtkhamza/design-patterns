package AdapterDemo;

import AdapterDemo.Stategy.IStrategy;

public class Client {
    IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public int[] traiterImage(int[] image){
        return strategy.traiter(image);
    }
}
