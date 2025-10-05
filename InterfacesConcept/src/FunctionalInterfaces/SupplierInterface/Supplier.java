package FunctionalInterfaces.SupplierInterface;

/*
 * Represents the supplier of a result. Accepts no input parameter but produce a result
 * Present in package: java.util.function
 */
@FunctionalInterface
public interface Supplier<T> {
    T get();
}
