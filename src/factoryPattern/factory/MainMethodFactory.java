package factoryPattern.factory;

import factoryPattern.chocolate.Chocolate;
import factoryPattern.chocolate.ChocolateException;
import factoryPattern.chocolate.ChocolateType;

public class MainMethodFactory {
    public static void main(String[] args) throws ChocolateException {

        Factory factory1 = new WedelFactory();
        Chocolate wedel = factory1.createChocolate(ChocolateType.Dark);
        wedel.tasteChocolate();
        System.out.println("-----------------------------------------");

        // nie rzuca wyjatkiem- zastosowanie opcji default-
        // wyprodukuje z orzechami przy podaniu nieistsniejacego typu czekolady
        Chocolate oreoWedel = factory1.createChocolate(ChocolateType.Milk);
        oreoWedel.tasteChocolate();
        System.out.println("-----------------------------------------");

        Factory factory = new MilkaFactory();
        Chocolate milka = factory.createChocolate(ChocolateType.Milk);
        milka.tasteChocolate();
        System.out.println("-----------------------------------------");

        try {
            // przy podaniu typu czekolady , ktora nie jest produkowana przez Milke- ma rzucic wyjatkiem!
            Chocolate milkaDark = factory.createChocolate(ChocolateType.Dark);
            milkaDark.tasteChocolate();
        } catch (ChocolateException chocolateExeption) {
            System.out.println("We do not produce in Milka Factory such chocolates, why won't you try OREO?!");
            Chocolate milkaOreo = factory.createChocolate(ChocolateType.Oreo);
            milkaOreo.tasteChocolate();


        }
    }
}
