package StreamTerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// min(Comparator<T> comparator)
// max(Comparator<T> comparator)
public class MinMaxOpn {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);

        Optional<Integer> minValueType1 = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .min((Integer val1, Integer val2) -> val1 - val2);

        System.out.println(minValueType1.get());

        Optional<Integer> minValueType2 = numbers.stream()
                .filter((Integer val) -> val >= 3)
                .min((Integer val1, Integer val2) -> val2 - val1);

        System.out.println(minValueType2.get());
    }
}
