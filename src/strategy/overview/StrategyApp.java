package strategy.overview;

import strategy.overview.algorithms.StrategyImp1;
import strategy.overview.algorithms.StrategyImp2;
import strategy.overview.algorithms.StrategyImp3;

public class StrategyApp {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new StrategyImp1());
        context.applyStrategy();
        context.setStrategy(new StrategyImp2());
        context.applyStrategy();
        context.setStrategy(new StrategyImp3());
        context.applyStrategy();
    }
}
