package factoryPattern.factory;

import factoryPattern.chocolate.Chocolate;
import factoryPattern.chocolate.ChocolateType;
import factoryPattern.chocolate.Wedel;
import factoryPattern.factory.Factory;

public class WedelFactory implements Factory {
    @Override
    public Chocolate createChocolate(ChocolateType chocolateType) {
        Chocolate chocolate;
        switch (chocolateType) {
            case Nuts:
                chocolate = new Wedel(ChocolateType.Nuts);
                break;
            case Dark:
                chocolate = new Wedel(ChocolateType.Dark);
                break;
            default:
                System.out.println("DEFAULT message: Wedel doesn't produce such chocolate, but we recommend to taste the one with NUTS! ");
                chocolate = new Wedel(ChocolateType.Nuts);
        }
        return chocolate;
    }
}
