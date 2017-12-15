package chainOfResponsibility;

public class BlackPlusSugar extends Coffee {

    public BlackPlusSugar(CoffeeType coffeeType) {
        super(coffeeType);
    }

    @Override
    public void prepareCoffee(CoffeeType type) {
        if (type == CoffeeType.blackPlusSugar) {
            System.out.println("Adding sugar to black coffee!");
        } else if (nextCoffeeOption != null) {
            nextCoffeeOption.prepareCoffee(type);
        }

    }
}
