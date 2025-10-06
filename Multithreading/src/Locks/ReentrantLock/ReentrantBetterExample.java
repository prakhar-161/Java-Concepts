package Locks.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantBetterExample {
    private final ReentrantLock lock = new ReentrantLock(true);

    public void methodA() {
        lock.lock();
        try {
            System.out.println("Inside Method A");
            methodB();  // Reentrant lock allows the same thread to enter methodB and acquire lock again (reentrant behavior)
        } finally {
            System.out.println("Finishing Method A");
            lock.unlock();
        }
    }

    public void methodB() {
        lock.lock();
        try {
            System.out.println("Inside Method B");
        } finally {
            System.out.println("Finishing Method B");
            lock.unlock();
        }
    }

    public static void main(String[] args) {
        ReentrantBetterExample example = new ReentrantBetterExample();
        example.methodA();
    }
}

