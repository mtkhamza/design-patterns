package decorator.decorators;

import decorator.drinks.Drink;

public abstract class AbstractDecorator extends Drink {

    protected Drink drink;

    public AbstractDecorator(Drink drink) {
        super();
        this.drink = drink;
    }

    @Override
    public abstract String getDescription();

}


