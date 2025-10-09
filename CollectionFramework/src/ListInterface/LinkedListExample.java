package ListInterface;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        // using deque functionality
        list.addLast(200);
        list.addLast(300);
        list.addLast(400);
        list.addFirst(100);
        System.out.println(list.getFirst());

        // using List functionality
        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(0,100);
        list2.add(1,300);
        list2.add(2,400);
        list2.add(1,200);
        System.out.print(list2);
    }
}
