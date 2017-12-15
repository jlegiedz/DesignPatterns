package chainOfResponsibility;

public abstract class Coffee {

    protected Coffee nextCoffeeOption;
    protected CoffeeType type;


    public void setNextCoffeeOption(Coffee nextOption) {
        nextCoffeeOption = nextOption;
    }

    public Coffee() {

    }

    public Coffee(CoffeeType coffeeType) {
        type = coffeeType;
    }

    public abstract void prepareCoffee(CoffeeType type);
}
