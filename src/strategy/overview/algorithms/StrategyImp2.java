package strategy.overview.algorithms;

import strategy.overview.IStrategy;

public class StrategyImp2 implements IStrategy {

    @Override
    public void apply() {
        System.out.println("Applying strategy number 2");
    }
}
