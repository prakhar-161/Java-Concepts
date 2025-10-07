package Locks.ReadWriteLockExample;

import java.util.concurrent.locks.ReadWriteLock;

public class SharedResource {
    boolean isAvailable = false;
    public void producer(ReadWriteLock lock) {
        lock.readLock().lock();
        try {
            System.out.println("Read lock acquired by: " + Thread.currentThread().getName());
            Thread.sleep(6000);
        } catch (InterruptedException e) {
            //
        } finally {
            lock.readLock().unlock();
            System.out.println("Read lock release by: " + Thread.currentThread().getName());
        }
    }

    public void consumer(ReadWriteLock lock) {
        lock.writeLock().lock();
        try {
            System.out.println("Write lock acquired by: " + Thread.currentThread().getName());
            isAvailable = false;
        } catch (Exception e) {
            //
        } finally {
            lock.writeLock().unlock();
            System.out.println("Write lock release by: " + Thread.currentThread().getName());
        }
    }
}
