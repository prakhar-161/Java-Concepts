package ListInterface;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ArrayListExample {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        // using arrayList methods
        list1.add(0,100);
        list1.add(1,200);
        list1.add(2,300);

        // addAll(int index, Collection c)
        List<Integer> list2 = new ArrayList<>();
        list2.add(0,400);
        list2.add(1,500);
        list2.add(2,600);

        list1.addAll(2, list2);
        list1.forEach((Integer val) -> System.out.print(val + " "));
        System.out.println();

        // replaceAll(UnaryOperator op)
        list1.replaceAll((Integer val) -> -1 * val);
        System.out.println("After replaceAll: ");
        list1.forEach((Integer val) -> System.out.print(val + " "));
        System.out.println();

        // sort(Comparator c)
        list1.sort((Integer a, Integer b) -> a - b);
        System.out.println("After sort in increasing order: ");
        list1.forEach((Integer val) -> System.out.print(val + " "));
        System.out.println();

        // get(int index)
        System.out.println("Value present at index 2 is: " + list1.get(2));

        // set(int index, Element e)
        list1.set(2, -4000);
        System.out.println("After set method: ");
        list1.forEach((Integer val) -> System.out.print(val + " "));
        System.out.println();

        // remove(int index)
        list1.remove(2);
        System.out.println("After removing index value: ");
        list1.forEach((Integer val) -> System.out.print(val + " "));
        System.out.println();

        // indexOf(Object o)
        System.out.println("Index of -200 Integer Object is: " + list1.indexOf(-200));

        // need to provide the index in ListIterator, from where it has to start
        // here, starting from the end of the list
        ListIterator<Integer> listIterator1 = list1.listIterator(list1.size());

        // traversing in backward direction
        while(listIterator1.hasPrevious()) {
            int previousVal = listIterator1.previous();
            System.out.println("Traversing backward: " + previousVal + " nextIndex: " + listIterator1.nextIndex() + " previous index: " + listIterator1.previousIndex());
            if(previousVal == -100) {
                listIterator1.set(-50);
            }
        }
        list1.forEach((Integer val) -> System.out.println("After set: " + val));
    }
}
