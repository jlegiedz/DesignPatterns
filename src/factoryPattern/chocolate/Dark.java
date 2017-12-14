package factoryPattern.chocolate;

public class Dark extends Chocolate {
    private String cacao;

    public Dark() {
        super(ChocolateType.Dark);
    }

    @Override
    public void tasteChocolate() {
        System.out.println("You are tasting a choclate type " + this.chocolateType);
    }
}
