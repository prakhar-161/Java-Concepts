package QueueInterface;

import java.util.PriorityQueue;

public class MinPriorityQueueExample {
    public static void main(String[] args) {
        // min priority queue, used to solve problems of min-heap
        PriorityQueue<Integer> minPQ = new PriorityQueue<>();
        minPQ.add(5);
        minPQ.add(2);
        minPQ.add(8);
        minPQ.add(1);

        minPQ.forEach((Integer val) -> System.out.println(val));

        // remove top element from the PQ and print
        while(!minPQ.isEmpty()) {
            int ele = minPQ.poll();
            System.out.println("remove from top: " + ele);
        }
    }
}
