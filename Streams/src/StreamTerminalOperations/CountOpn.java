package StreamTerminalOperations;

import java.util.Arrays;
import java.util.List;

// returns the count of element present in the stream
public class CountOpn {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);
        long numOfValuesPresent = numbers.stream().filter((Integer val) -> val>=3).count();
        System.out.println(numOfValuesPresent);

    }
}
