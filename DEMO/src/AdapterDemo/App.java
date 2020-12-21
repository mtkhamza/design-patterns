package AdapterDemo;

import AdapterDemo.Adapter.Adapter;
import AdapterDemo.Stategy.StategyImpls.StrategyImpl1;
import AdapterDemo.Stategy.StategyImpls.StrategyImpl2;

public class App {
    public static void main(String[] args) {
        Client client = new Client();
        int[] image = new int[25];
        client.setStrategy(new StrategyImpl1());
        client.traiterImage(image);
        client.setStrategy(new StrategyImpl2());
        client.traiterImage(image);
        client.setStrategy(new Adapter());
        client.traiterImage(image);
    }
}





