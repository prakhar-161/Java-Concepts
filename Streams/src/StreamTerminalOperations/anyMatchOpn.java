package StreamTerminalOperations;

import java.util.Arrays;
import java.util.List;

// anyMatch(Predicate<T> predicate)
// Checks if any value in the stream match the given predicate and return the boolean
public class anyMatchOpn {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);

        boolean hasAnyValueGreaterThanThree = numbers.stream()
                .anyMatch((Integer val) -> val > 3);

        System.out.println(hasAnyValueGreaterThanThree);
    }
}
