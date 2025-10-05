import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SingleStreamSingleTerminalOpn {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2,1,4,7,10);

        Stream<Integer> filteredNumbers = numbers.stream()
                .filter((Integer val) -> val >= 3);

        filteredNumbers.forEach((Integer val) -> System.out.println(val + " "));
        // this forEach consumed the filteredNumbers stream

        // trying to use the closed stream again
        List<Integer> listFromStream = filteredNumbers.collect(Collectors.toList());

    }
}
