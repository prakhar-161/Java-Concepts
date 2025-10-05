package StreamIntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// limit(long maxSize)
// truncate the stream to no longer have the given maximum length
public class LimitOpn {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,3,4,6);
        numbers.add(8);  // UnsupportedOperationException
        Stream<Integer> numberStream = numbers.stream().limit(3);

        List<Integer> numberList = numberStream.collect(Collectors.toList());
        System.out.println(numberList);
    }
}
