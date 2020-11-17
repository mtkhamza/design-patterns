package decorator.drinks;

public class Deca extends Drink {

    public Deca(){
        this.description = "Deca";
    }
    @Override
    public double cout() {
        return 7;
    }
}
