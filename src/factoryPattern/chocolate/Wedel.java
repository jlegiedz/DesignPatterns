package factoryPattern.chocolate;

public class Wedel extends Chocolate {

    public Wedel() {
        super();
    }

    public Wedel(ChocolateType chocolateType) {
        super(chocolateType);
    }


    @Override
    public void tasteChocolate() {
        System.out.println("tasting Wedel chcoclate of taste: " + this.chocolateType);
    }
}
