package AdapterDemo.Stategy.StategyImpls;

import AdapterDemo.Stategy.IStrategy;

public class StrategyImpl2 implements IStrategy {
    @Override
    public int[] traiter(int[] image) {
        System.out.println("#####################");
        System.out.println("## Implementation 2");
        return new int[0];
    }
}






