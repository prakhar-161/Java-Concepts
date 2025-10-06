package Locks.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        ReentrantLock lock = new ReentrantLock();  // just depends on the lock, not any object

        SharedResource resource1 = new SharedResource();
        Thread th1 = new Thread(() -> {
            resource1.producer(lock);
        });

        SharedResource resource2 = new SharedResource();
        Thread th2 = new Thread(() -> {
            resource2.producer(lock);
        });

        th1.start();
        th2.start();
    }
}

// multiple objects, multiple threads, one lock

// this above implementation shows that only one thread will be there in the critical section at a time.

// here two threads are entering the same.
// Reentrant lock allows threads to enter a lock multiple times without causing deadlock on itself.
// Requires manual locking and unlocking

// TryLock() - Threads can attempt to acquire a lock without waiting indefinitely
