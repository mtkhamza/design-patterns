package strategy.demo.algorithms;

import strategy.demo.IStrategy;

public class StrategyImpMAR implements IStrategy {
    @Override
    public int applyIGR(float salaireBrutAnnuel) {
        if(salaireBrutAnnuel < 40000)
            return 5;
        else
            if (salaireBrutAnnuel >= 40000 && salaireBrutAnnuel <= 120000)
            return 20;
        else if (salaireBrutAnnuel > 120000)
            return 42;
        else return  0;
    }
}
