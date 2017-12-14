package factoryPattern.chocolate;

public class Milka extends Chocolate {

    public Milka() {
    }

    public Milka(ChocolateType chocolateType) {
        super(chocolateType);
    }

    @Override
    public void tasteChocolate() {
        System.out.println("tasting Milka chocolate of taste: " + this.chocolateType);
    }
}
