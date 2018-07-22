public abstract class Pizza {
    public enum Topping {
        HAM, MUSHROOM, ONION,
        PEPPER, SAUSAGE
    }
    final Set<Topping> toppings;

    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping) {
           toppings.add(Objects.requireNonNull(topping));
           return self();
        }

        abstract Pizza build();
    }

    Pizza(Builder<?> builder) {
        toppings = builder.toppings.clone();
    }
}

// Example of actual subclass
public class NyPizza extends Pizza  {
    public enum Size { SMALL, MEDIUM, LARGE }
    private final Size size;

    public static class Builder extends Pizza.Builder<Builder> {
        private final Size size;
        
        public Builder(Size size) {
            this.size = Objects.requireNonNull(size);
        }

        @Override public NyPizza build() {
            return new NyPizza(this);
        }

        @Override protected Builder self() { return this; }
    }

    private NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }
}
