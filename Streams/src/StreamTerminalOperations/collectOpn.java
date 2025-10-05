package StreamTerminalOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

// collect(Collector<T,A,R> collector)
// collect elements of the stream into a list or set
public class collectOpn {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);

        List<Integer> filteredNumberList = numbers.stream()
                .filter((Integer val) -> val % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(filteredNumberList);
    }
}
