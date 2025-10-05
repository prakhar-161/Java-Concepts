package FunctionalInterfaces.PredicateInterface;

/*
 * Represents a function, that accept one argument and return a boolean
 * Present in package: java.util.function
*/

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}
