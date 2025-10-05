package part2practise;

import part2.SharedResource;

public class Main {
    public static void main(String[] args) {
        SharedResource sharedResourceObj = new SharedResource();

        // lambda way of creating a thread
        Thread producerThread = new Thread(() -> {
            System.out.println("Producer Thread: " + Thread.currentThread().getName());
            try {
                Thread.sleep(3000L);
            } catch (Exception e) {
                // exception handling here
            }
            sharedResourceObj.addItem();
        });

        Thread consumerThread = new Thread(() -> {
            System.out.println("Consumer Thread: " + Thread.currentThread().getName());
            sharedResourceObj.consumeItem();
        });

        // both the threads are working on the same shared resource

        producerThread.start();
        consumerThread.start();
    }
}
