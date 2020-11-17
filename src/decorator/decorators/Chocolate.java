package decorator.decorators;

import decorator.drinks.Drink;

public class Chocolate extends AbstractDecorator {

    public Chocolate(Drink drink) {
        super(drink);
    }

    @Override
    public String getDescription() {
        return drink.getDescription()+" with chocolate ";
    }

    @Override
    public double cout() {
        return 0.7 + drink.cout();
    }


}
