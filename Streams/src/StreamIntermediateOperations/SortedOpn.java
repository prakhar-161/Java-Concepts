package StreamIntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//sort the elements
public class SortedOpn {
    public static void main(String[] args) {
        Integer[] arr = {1,5,2,7,4,4,2,0,9};
        Stream<Integer> arrStream = Arrays.stream(arr).sorted();
        List<Integer> integerList = arrStream.collect(Collectors.toUnmodifiableList());
        System.out.println(integerList);

        Stream<Integer> arrStream2 = Arrays.stream(arr).sorted((Integer val1, Integer val2) -> val2-val1);
        List<Integer> integerList2 = arrStream2.collect(Collectors.toUnmodifiableList());
        System.out.println(integerList2);
    }
}
