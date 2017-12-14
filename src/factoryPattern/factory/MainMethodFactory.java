package factoryPattern.factory;

import factoryPattern.chocolate.Chocolate;
import factoryPattern.chocolate.ChocolateException;
import factoryPattern.chocolate.ChocolateType;

public class MainMethodFactory {
    public static void main(String[] args) throws ChocolateException {

        Factory factory1 = new WedelFactory();
        Chocolate wedel = factory1.createChocolate(ChocolateType.Dark);
        wedel.tasteChocolate();

        // nie rzuca wyjatkiem- zastosowanie opcji default-
        // wyprodukuje z orzechami przy podaniu nieistsniejacego typu czekolady

        Chocolate oreoWedel = factory1.createChocolate(ChocolateType.Milk);
        oreoWedel.tasteChocolate();

        Factory factory = new MilkaFactory();
        Chocolate milka = factory.createChocolate(ChocolateType.Milk);
        milka.tasteChocolate();

        // przy podaniu typu czekolady , ktora nie jest produkowana przez Milke- ma rzucic wyjatkiem!
        Chocolate milkaDark = factory.createChocolate(ChocolateType.Dark);
        milkaDark.tasteChocolate();
    }
}
