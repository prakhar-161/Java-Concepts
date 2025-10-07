package Locks.StampedLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    boolean isAvailable = true;
    StampedLock lock = new StampedLock();

    public void producer() {
        long stamp = lock.readLock();
        try {
            System.out.println("Read lock acquired by: " + Thread.currentThread().getName());
            isAvailable = true;
            Thread.sleep(6000);
        } catch(Exception e) {
            // handle exception
        } finally {
            lock.unlock(stamp);
            System.out.println("Read lock release by: " + Thread.currentThread().getName());
        }
    }

    public void consumer() {
        long stamp = lock.readLock();
        try {
            System.out.println("Write lock acquired by: " + Thread.currentThread().getName());
            isAvailable = false;
        } catch (Exception e) {
            //
        } finally {
            lock.unlock(stamp);
            System.out.println("Write lock release by: " + Thread.currentThread().getName());
        }
    }
}
