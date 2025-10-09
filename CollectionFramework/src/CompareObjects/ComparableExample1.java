package CompareObjects;

import java.util.Arrays;
import java.util.Comparator;

public class ComparableExample1 {
    public static void main(String[] args) {
        Integer[] tring = new Integer[]  {5, 3, 2, 6, 8, 10, 1};
        Comparator<Integer> comparator = (a, b) -> {
            System.out.println(Arrays.toString(tring) + ": comparing " + a + " and " + b);
            return a.compareTo(b);
        };
        Arrays.sort(tring, comparator);
        System.out.println(Arrays.toString(tring));
    }
}
