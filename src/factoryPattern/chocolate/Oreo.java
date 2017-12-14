package factoryPattern.chocolate;

public class Oreo extends Chocolate {
    private String cacao;
    private String cookiesOreo;
    private String sugar;

    public Oreo(String cacao, String cookiesOreo, String sugar) {
        super(ChocolateType.Oreo);
        this.cacao = cacao;
        this.cookiesOreo = cookiesOreo;
        this.sugar = sugar;
    }

    @Override
    public void tasteChocolate() {
        System.out.println("You are tasting a choclate type " + this.chocolateType);
    }
}
