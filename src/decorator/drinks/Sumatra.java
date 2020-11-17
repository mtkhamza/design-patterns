package decorator.drinks;

public class Sumatra extends Drink {

    public Sumatra(){
        this.description = "Sumatra";
    }
    @Override
    public double cout() {
        return 8;
    }
}
