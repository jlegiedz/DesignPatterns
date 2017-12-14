package factoryPattern.chocolate;

public class ChocolateException extends Exception {

    public ChocolateException(ChocolateType chocolateType) {
        super("Nothing bad happend: you just chose a wrong chcocolate type! " + chocolateType);
    }
}
