package Locks.Condition;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;
    ReentrantLock lock = new ReentrantLock();
    Condition condition = lock.newCondition();          // uses condition variables on reentrant lock object 'lock'

    public void producer() {
        try {
            lock.lock();
            System.out.println("Produce lock acquired by: " + Thread.currentThread().getName());
            if(isAvailable) {
                // already available, thread has to wait for it to consume
                System.out.println("Producer thread is waiting: " + Thread.currentThread().getName());
                condition.await();
            }
            isAvailable = true;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("Produce lock released by: " + Thread.currentThread().getName());
        }
    }

    public void consume() {
        try {
            Thread.sleep(3000);
            lock.lock();
            System.out.println("Consume lock acquired by: " + Thread.currentThread().getName());
            if(!isAvailable) {
                // not available to consume, thread has to wait it to be produced
                System.out.println("Consumer thread is waiting: " + Thread.currentThread().getName());
                condition.await();
            }
            isAvailable = false;
            condition.signalAll();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
            System.out.println("Consume lock released by: " + Thread.currentThread().getName());
        }
    }
}
