package strategy.overview.algorithms;

import strategy.overview.IStrategy;

public class StrategyImp1 implements IStrategy {

    @Override
    public void apply() {
        System.out.println("Applying strategy number 1");
    }
}
