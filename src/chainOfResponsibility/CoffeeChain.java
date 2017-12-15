package chainOfResponsibility;

public class CoffeeChain {

    public static void main(String[] args) {

        Coffee coffee = getCoffeeChain();
        coffee.prepareCoffee(CoffeeType.blackPlusSugar);

    }

    public static Coffee getCoffeeChain() {
        Coffee blackCoffee = new Black(CoffeeType.black);
        Coffee blackWithSugar = new BlackPlusSugar(CoffeeType.blackPlusSugar);
        Coffee blackWithMilk = new BlackPlusMilk(CoffeeType.blackPlusMilk);

        blackCoffee.setNextCoffeeOption(blackWithSugar);
        blackWithSugar.setNextCoffeeOption(blackWithMilk);

        return blackCoffee;
    }
}
