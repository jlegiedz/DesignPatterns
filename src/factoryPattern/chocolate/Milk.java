package factoryPattern.chocolate;

public class Milk extends Chocolate {
    private String cacao;
    private String milk;
    private String sugar;

    public Milk(String cacao, String milk, String sugar) {
        super(ChocolateType.Milk);
        this.cacao = cacao;
        this.milk = milk;
        this.sugar = sugar;
    }

    @Override
    public void tasteChocolate() {
        System.out.println("You are tasting a choclate type " + this.chocolateType);
    }
}
