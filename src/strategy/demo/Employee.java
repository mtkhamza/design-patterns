package strategy.demo;

public class Employee {
    private String cin;
    private float salaireBrutMensuel;
    private IStrategy strategy;

    public Employee(String cin, float salaireBrutMensuel) {
        this.cin = cin;
        this.salaireBrutMensuel = salaireBrutMensuel;
    }

    public String getCin() {
        return cin;
    }

    public float getSalaireBrutMensuel() {
        return salaireBrutMensuel;
    }

    public void setCin(String cin) {
        this.cin = cin;
    }

    public void setSalaireBrutMensuel(float salaireBrutMensuel) {
        this.salaireBrutMensuel = salaireBrutMensuel;
    }


    public float getSalaireNetMensuel() {
        float salaireBrutAnnuel = salaireBrutMensuel * 12;
        float igr = strategy.applyIGR(salaireBrutAnnuel);
        float salaireNetAnnuel = salaireBrutMensuel * 12 - igr;
        return salaireNetAnnuel / 12;
    }

    public IStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public int applyStrategy() {
        float salaireBrutAnnuel = salaireBrutMensuel * 12;
        return strategy.applyIGR(salaireBrutAnnuel);
    }
}
