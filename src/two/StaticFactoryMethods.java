/**
 * Traditionally, you would provide a public
 * constructor to obtain an instance, but
 * you can instead use public static factory
 * method, which is a static method that
 * returns an instance of the class
 */


/**
 * Item 1: Consider static factory methods
 * instead of constructors
 */

public static Boolean valueOf(boolean b) {
    return b ? Boolean.TRUE : Boolean.FALSE;
}

