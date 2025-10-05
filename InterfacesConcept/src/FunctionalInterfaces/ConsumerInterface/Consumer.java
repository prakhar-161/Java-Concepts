package FunctionalInterfaces.ConsumerInterface;

/*
* Represents an operation, that accepts a single input parameter and returns no result
* Present in package: java.util.function
*/

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
