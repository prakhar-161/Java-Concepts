package StreamIntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// skip(long n)
// skip the first n elements of the stream
public class SkipOpn {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,3,4,6);
        Stream<Integer> numberStream = numbers.stream().skip(3);

        List<Integer> numberList = numberStream.collect(Collectors.toList());
        System.out.println(numberList);
    }
}
