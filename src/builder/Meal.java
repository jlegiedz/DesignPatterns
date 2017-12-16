package builder;

public class Meal {
    MealType mealType;
    String brew;
    Boolean packing;
    String dessert;


    private Meal(Builder builder) {
        this.mealType = builder.mealType;
        this.brew = builder.brew;
        this.packing = builder.packing;
        this.dessert = builder.dessert;

    }

    @Override
    public String toString() {
        return "Meal: " +
                "mealType: " + mealType +
                ", brew: " + brew +
                ", packing: " + packing +
                ", dessert: " + dessert;
    }

    public static class Builder {
        MealType mealType;
        String brew;
        Boolean packing;
        String dessert;

        public Builder(MealType mealType, String brew, Boolean packing, String dessert) {
            this.mealType = mealType;
            this.brew = brew;
            this.packing = packing;
            this.dessert = dessert;
        }

        public Builder() {

        }

        public Builder mealType(MealType type) {
            this.mealType = type;
            return this;
        }

        public Builder brew(String brew) {
            this.brew = brew;
            return this;
        }

        public Builder packing(Boolean packing) {
            this.packing = packing;
            return this;
        }

        public Builder dessert(String desert) {
            this.dessert = dessert;
            return this;

        }

        public Meal build() {
            return new Meal(this);
        }

    }
}
