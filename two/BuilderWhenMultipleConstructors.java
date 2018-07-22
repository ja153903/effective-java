/**
 * Traditionally, programmers have used the telescoping 
 * constructor pattern, in which you provide a 
 * constructor with only the required parameters,
 * anotehr with as single optional parameter,
 * a third with two optional parameters, and so on.
 */

/**
 * Another pattern people will implement is the
 * JavaBeans pattern where you have an empty
 * constructor and set values through setters
 */

/**
 * To improve on all this, we might want to
 * consider using the Builder pattern
 * which combines the good parts of 
 * both the telescoping constructor pattern
 * and the JavaBeans pattern
 */

public class NutritionFacts {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohydrate;

    public static class Builder {
        // Required parameters
        private final int servingSize;
        private final int servings;

        // Optional parameters - initialized to default
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohydrate = 0;

        public Builder(int servingSize, int servings) {
            this.servingSize = servingSize;
            this.servings = servings;
        }

        public Builder calories(int val) {
            calories = val; return this;
        }

        public Builder fat(int val) {
            fat = val; return this;
        }

        public Builder sodium(int val) {
            sodium = val; return this;
        }

        public Builder carbohydrate(int val) {
            carbohydrate = val; return this;
        }

        public NutritionFacts build() {
            return new NutritionFacts(this);
        }
    }

    private NutritionFacts(Builder builder) {
        servingSize = builder.servingSize;
        servings = builder.servings;
        calories = builder.calories;
        fat = builder.fat;
        sodium = builder.sodium;
        carbohydrate = builder.carbohydrate;
    }
}

public static void main(String[] args) {
    NutritionFacts cocaCola = new NutritionFacts
                                .Builder(240, 8)
                                .calories(100)
                                .sodium(35)
                                .carbohydrate(27)
                                .build();

}
