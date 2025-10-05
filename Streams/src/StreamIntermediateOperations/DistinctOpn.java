package StreamIntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Removes duplicate from stream
public class DistinctOpn {
    public static void main(String[] args) {
        Integer[] arr = {1,5,2,7,4,4,2,0,9};
        Stream<Integer> arrStream = Arrays.stream(arr).distinct();
        List<Integer> integerList = arrStream.collect(Collectors.toUnmodifiableList());
        System.out.println(integerList);
    }
}
