package strategy.demo.algorithms;

import strategy.demo.IStrategy;

public class StrategyImpALG implements IStrategy {
    @Override
    public int applyIGR(float salaireBrutAnnuel) {
        if(salaireBrutAnnuel < 40000)
            return 7;
        else if (salaireBrutAnnuel >= 40000 && salaireBrutAnnuel <= 120000)
            return 22;
        else if (salaireBrutAnnuel > 120000)
            return 44;
        else return 0;
    }
}
