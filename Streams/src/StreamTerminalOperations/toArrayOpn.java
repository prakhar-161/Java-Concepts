package StreamTerminalOperations;

import java.util.Arrays;
import java.util.List;

// collects elements of the stream into array
public class toArrayOpn {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);

        Object[] filteredNumberArrType1 = numbers.stream()
                .filter((Integer val) -> val > 3)
                .toArray();

        Integer[] filteredNumberArrType2 = numbers.stream()
                .filter((Integer val) -> val > 3)
                .toArray((int size) -> new Integer[size]);
    }
}
