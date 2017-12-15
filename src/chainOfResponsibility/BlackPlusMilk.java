package chainOfResponsibility;

public class BlackPlusMilk extends Coffee {

    public BlackPlusMilk(CoffeeType coffeeType) {
        super(coffeeType);
    }

    @Override
    public void prepareCoffee(CoffeeType type) {
        if (type == CoffeeType.blackPlusMilk) {
            System.out.println("Adding milk to black coffee!");
        } else if (nextCoffeeOption != null) {
            nextCoffeeOption.prepareCoffee(type);
        }
    }
}
