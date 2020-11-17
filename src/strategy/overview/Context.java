package strategy.overview;


public class Context {

    private IStrategy strategy;

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void applyStrategy() {
        strategy.apply();
    }

}
