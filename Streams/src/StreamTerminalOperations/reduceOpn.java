package StreamTerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// reduce(BinaryOperation<T> accumulator)
// does reduction on the elements of the stream. Perform associative aggregation function.
public class reduceOpn {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);

        Optional<Integer> reducedValue = numbers.stream().reduce((Integer val1, Integer val2) -> val1 + val2);
        System.out.println(reducedValue.get());

        // 24
    }
}
