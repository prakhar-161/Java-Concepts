//Helps to perform operation on the stream concurrently, taking advantage of multi-core CPU.
//ParallelStream() method is used instead of regular stream() method.
//Internally it does:
//    • Task Splitting: it uses "Spliterator" function to split the data into multiple chunks.
//    • Task submission and parallel processing: Uses Fork-Join pool technique.


import java.util.Arrays;
import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(
                10, 12, 14, 16, 18, 20, 22, 24, 26, 28,
                30, 32, 34, 36, 38, 40, 42, 44, 46, 48,
                50, 52, 54, 56, 58, 60, 62, 64, 66, 68,
                70, 72, 74, 76, 78, 80, 82, 84, 86, 88,
                90, 92, 94, 96, 98, 99, 91, 83, 75, 67,
                59, 51, 43, 35, 27, 19, 29, 39, 49, 69,
                34, 36, 38, 40, 42, 44, 46, 48, 56, 78
        );

        // Sequential Processing
        long sequentialProcessingStartTime = System.currentTimeMillis();
        numbers.stream()
                .map((Integer val) -> val * val)
                .forEach((Integer val) -> System.out.print(val + " "));

        System.out.println();
        System.out.println("Sequential Processing time taken: " + (System.currentTimeMillis() - sequentialProcessingStartTime) + " ms");


        // Parallel Processing
        long parallelProcessingStartTime = System.currentTimeMillis();
        numbers.parallelStream()
                .map((Integer val) -> val * val)
                .forEach((Integer val) -> System.out.print(val + " "));

        System.out.println();
        System.out.println("Parallel Processing time taken: " + (System.currentTimeMillis() - parallelProcessingStartTime) + " ms");
    }
}
