package FunctionalInterfaces.FunctionInterface;

/*
 * Represents function, that accepts one argument process, it and produce a result
 * Present in package: java.util.function
*/

@FunctionalInterface
public interface Function<T,R> {
    R apply(T t);
}
