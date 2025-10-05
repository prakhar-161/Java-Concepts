package StreamIntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// peek(Consumer<T> action)
// Helps you to see the intermediate result
// can be used for debugging
public class PeekOpn {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,3,4,6);
        Stream<Integer> numberStream = numbers.stream()
                .filter((Integer val) -> val > 2)
                .peek((Integer val) -> System.out.print(val + " "))
                .map((Integer val) -> -1 * val);

        List<Integer> numberList = numberStream.collect(Collectors.toList());
        System.out.println();
        System.out.println(numberList);
    }
}
