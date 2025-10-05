package StreamTerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// finds the first element of the stream regardless of whether the filter condition is given or not
public class findFirstOpn {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);

        Optional<Integer> firstValue = numbers.stream()
                .filter((Integer val) -> val > 3)
                .findFirst();

        System.out.println(firstValue.get());
    }
}
