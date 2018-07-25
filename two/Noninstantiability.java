public class UtilityClass {
    // By making it private, we make sure no one can instantiate it
    private UtilityClass() {
        throw new AssertionError();
    }
}
