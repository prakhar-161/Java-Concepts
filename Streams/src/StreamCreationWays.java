import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamCreationWays {
    public static void main(String[] args) {
        // From Collection
        List<Integer> salaryList = Arrays.asList(3000, 4100, 9000, 1000, 3500);
        Stream<Integer> streamFromIntegerList = salaryList.stream();

        // From Array
        Integer[] salaryArr = {3000, 4100, 9000, 1000, 3500};
        Stream<Integer> streamFromIntegerArray = Arrays.stream(salaryArr);

        // From Static method
        Stream<Integer> streamFromStaticMethod = Stream.of(2000, 4100, 9000, 1000, 3500);

        // From Stream Builder
        Stream.Builder<Integer> streamBuilder = Stream.builder();
        streamBuilder.add(1000).add(9000).add(3500);

        Stream<Integer> streamFromStreamBuilder = streamBuilder.build();

        // From Stream Iterate
        Stream<Integer> streamFromIterate = Stream.iterate(1000, (Integer n) -> n + 5000).limit(5);


    }
}
