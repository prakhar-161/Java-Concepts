package StreamIntermediateOperations;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// map() -> used to transform each element
public class MapOpn {
    public static void main(String[] args) {
        Stream<String> nameStream = Stream.of("HELLO", "EVERYBODY", "HOW", "ARE", "YOU", "DOING");
        Stream<String> mappedNamesStream = nameStream.map((String name) -> name.toLowerCase());
        List<String> mappedNames = mappedNamesStream.collect(Collectors.toList());
        System.out.println(mappedNames);
    }
}
