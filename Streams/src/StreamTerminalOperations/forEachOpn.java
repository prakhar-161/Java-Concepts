package StreamTerminalOperations;

import java.util.Arrays;
import java.util.List;

// forEach(Consumer<T> action)
// Perform action on each element of the stream. Do not return any value.
public class forEachOpn {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);
        numbers.stream()
                .filter((Integer val) -> val > 3)
                .forEach((Integer val) -> System.out.print(val + " "));
    }
}
