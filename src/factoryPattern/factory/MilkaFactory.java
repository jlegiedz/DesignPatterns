package factoryPattern.factory;

import factoryPattern.chocolate.Chocolate;
import factoryPattern.chocolate.ChocolateException;
import factoryPattern.chocolate.ChocolateType;
import factoryPattern.chocolate.Milka;

public class MilkaFactory implements Factory {

    @Override
    public Chocolate createChocolate(ChocolateType chocolateType) throws ChocolateException {
        Chocolate chocolate = null;
        switch (chocolateType) {
            case Oreo:
                chocolate = new Milka(ChocolateType.Oreo);
                break;
            case Milk:
                chocolate = new Milka(ChocolateType.Milk);
                break;
            default:
                throw new ChocolateException(chocolateType);

        }
        return chocolate;
    }


}
