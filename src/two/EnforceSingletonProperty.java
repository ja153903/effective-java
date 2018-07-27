// Making a class a singleton can make it difficult to test its clients because
// it's impossible to substitute a mock implementation for a singleton unless it
// implements an interface that serves as its type

public class Elvis {
    public static final Elvis INSTANCE = new Elvis();
    private Elvis() { ... } // we have a private constructor
    // Another way we can get the instance without calling the static final object
    public static Elvis getInstance() { return INSTANCE; }
    public void leaveTheBuilding() { ... }
}

/**
 * Notice in this class construction that we have a static final
 * object called INSTANCE.
 * Note that every single instance we reference will be part of
 * the same object.
 */

// We should note that there is an improvement on this in Kotlin
// We can merely create an object in Kotlin
