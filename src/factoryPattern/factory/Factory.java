package factoryPattern.factory;

import factoryPattern.chocolate.Chocolate;
import factoryPattern.chocolate.ChocolateException;
import factoryPattern.chocolate.ChocolateType;

public interface Factory {
    public Chocolate createChocolate(ChocolateType chocolateType) throws ChocolateException;
}
