package AdapterDemo.Stategy.StategyImpls;

import AdapterDemo.Stategy.IStrategy;

public class StrategyImpl1 implements IStrategy {
    @Override
    public int[] traiter(int[] image) {
        System.out.println("#####################");
        System.out.println("## Implementation 1");
        return new int[0];
    }
}






