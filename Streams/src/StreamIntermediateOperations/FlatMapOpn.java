package StreamIntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Used to iterate over each element of the complex collection and helps to flatten it
// first convert the main list to stream and then convert the inner list to streams one by one
public class FlatMapOpn {
    public static void main(String[] args) {
        List<List<String>> sentenceList = Arrays.asList(
                Arrays.asList("I", "LOVE", "JAVA"),
                Arrays.asList("CONCEPTS", "ARE", "CLEAR"),
                Arrays.asList("ITS", "VERY", "EASY")
        );

        Stream<String> wordsStream1 = sentenceList.stream()
                .flatMap((List<String> sentence) -> sentence.stream());

        Stream<String> wordsStream2 = sentenceList.stream()
                .flatMap((sentence) -> sentence.stream())
                .map((String value) -> value.toLowerCase());

        List<String> wordsList = wordsStream1.collect(Collectors.toList());
        List<String> lowercaseWordsList = wordsStream2.collect(Collectors.toUnmodifiableList());

        System.out.println(wordsList);
        System.out.println(lowercaseWordsList);
    }
}
