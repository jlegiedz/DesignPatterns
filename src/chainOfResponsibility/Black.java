package chainOfResponsibility;

public class Black extends Coffee {

    public Black(CoffeeType coffeeType) {
        super(coffeeType);
    }

    @Override
    public void prepareCoffee(CoffeeType type) {
        Coffee coffee = new Black(type);
        if (type == CoffeeType.black) {
            System.out.println("Serving black coffee!");
        } else if (nextCoffeeOption != null) {
            nextCoffeeOption.prepareCoffee(type);
        }

    }
}
