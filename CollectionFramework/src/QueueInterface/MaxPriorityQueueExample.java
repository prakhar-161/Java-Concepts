package QueueInterface;

import java.util.PriorityQueue;

public class MaxPriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> maxPQ = new PriorityQueue<>((Integer a, Integer b) -> b-a);  // this is comparator
        maxPQ.add(5);
        maxPQ.add(2);
        maxPQ.add(8);
        maxPQ.add(1);

        maxPQ.forEach((Integer val) -> System.out.println(val));

        // remove top element from the PQ and print
        while(!maxPQ.isEmpty()) {
            int ele = maxPQ.poll();
            System.out.println("remove from top: " + ele);
        }
    }
}
