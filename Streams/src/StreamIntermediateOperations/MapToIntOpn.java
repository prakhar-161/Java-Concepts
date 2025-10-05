package StreamIntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

// mapToInt(ToIntFunction<T> mapper)
//helps to work with primitive "int" data types
public class MapToIntOpn {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("2", "1", "4", "7");
        IntStream numberStream = numbers.stream().mapToInt((String val) -> Integer.parseInt(val));

        int[] numberArray = numberStream.toArray();
        for(int num: numberArray) {
            System.out.print(num + " ");
        }
    }
}
