package decorator.drinks;

public class Espresso extends Drink {

    public Espresso(){
        this.description = "Espresso";
    }

    @Override
    public double cout() {
        return 6;
    }
}
