package decorator;


import decorator.decorators.Caramel;
import decorator.decorators.Chocolate;
import decorator.drinks.Drink;
import decorator.drinks.Espresso;

public class DecoratorApp {
    public static void main(String[] args) {
        Drink b = new Espresso();
        System.out.println("***************************");
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        System.out.println("***************************");
        b = new Chocolate(b);
        System.out.println(b.getDescription());
        System.out.println(b.cout());
        b = new Caramel(b);
        System.out.println("***************************");
        System.out.println(b.getDescription());
        System.out.println(b.cout());

    }
}
