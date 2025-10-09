package Iterables;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CollectionMethods {
    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(1);
        values.add(2);
        values.add(3);

        System.out.println("size: " + values.size());

        System.out.println("isEmpty: " + values.isEmpty());

        System.out.println("contains: " + values.contains(5));

        // add
        values.add(5);
        System.out.println("added: " + values.contains(5));

        // remove using index
        values.remove(3);
        System.out.println("removed using index: " + values.contains(5));

        // remove using object, remove the first occurence of the value
        values.remove(Integer.valueOf(3));
        System.out.println("removed using object value: " + values.contains(3));

        Stack<Integer> stackValues = new Stack<>();
        stackValues.add(6);
        stackValues.add(7);
        stackValues.add(8);
        // addAll
        values.addAll(stackValues);
        System.out.println("addAll testing using ContainsAll: " + values.containsAll(stackValues));
        // containsAll
        values.remove(Integer.valueOf(7));
        System.out.println("containsAll after removing 1 element: " + values.containsAll(stackValues));
        // removeAll
        values.removeAll(stackValues);
        System.out.println("removeAll: " + stackValues.contains(8));
        // clear
        values.clear();
        System.out.println("clear: " + values.isEmpty());
    }
}
