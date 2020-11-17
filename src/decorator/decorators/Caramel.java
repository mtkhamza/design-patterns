package decorator.decorators;

import decorator.drinks.Drink;

public class Caramel extends AbstractDecorator {

    public Caramel(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription()+" with caramel ";
    }

    @Override
    public double cout() {
        return 0.9 + drink.cout();
    }


}
