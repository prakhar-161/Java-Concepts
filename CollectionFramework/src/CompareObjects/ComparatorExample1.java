package CompareObjects;

import java.util.Arrays;

public class ComparatorExample1 {
    public static void main(String[] args) {
        Integer[] arr = {6, 4, 1, 9, 2, 11};
        Arrays.sort(arr, (Integer val1, Integer val2) -> val1 - val2);      //  ascending

        for(int v : arr) {
            System.out.print(v + " ");
        }
    }
}
