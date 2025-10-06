package Locks.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;
    ReentrantLock lock = new ReentrantLock();

    public void producer(ReentrantLock lock) {
        lock.lock();  // acquire lock
        try {
            // critical section code
            System.out.println("Lock acquired by: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(4000);
        } catch (Exception e) {
            // exception here
        } finally {
            System.out.println("Lock release by: " + Thread.currentThread().getName());
            lock.unlock(); // release lock
        }
    }
}
