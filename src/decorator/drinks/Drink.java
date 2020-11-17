package decorator.drinks;

public abstract class Drink {

    protected String description;

    public abstract double cout();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


}
