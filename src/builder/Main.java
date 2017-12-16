package builder;

public class Main {
    public static void main(String[] args) {

        Meal meal = new Meal.Builder().
                mealType(MealType.Beef_burger).
                brew("Pepsi").
                packing(false).
                build();

        System.out.println(meal);
    }
}
