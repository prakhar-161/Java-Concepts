package Iterables;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorMain {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);

        // using iterator
        System.out.println("Iterating the values using Iterator method");
        // creating iterator
        Iterator<Integer> valuesIterator = values.iterator();
        while(valuesIterator.hasNext()) {
            int val = valuesIterator.next();
            System.out.println(val);
            if(val == 3) {
                valuesIterator.remove();
            }
        }

        // for-each loop
        System.out.println("Iterating using forEach function");
        for(int val : values) {
            System.out.println(val);
        }

        // forEach method (iterating using lambda function)
        System.out.println("testing forEach method");
        values.forEach((Integer val) -> System.out.println(val));
    }
}
