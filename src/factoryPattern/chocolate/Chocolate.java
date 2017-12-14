package factoryPattern.chocolate;

public abstract class Chocolate {
    protected ChocolateType chocolateType;

    public Chocolate(ChocolateType chocolateType) {
        this.chocolateType = chocolateType;
    }

    public abstract void tasteChocolate();
}
