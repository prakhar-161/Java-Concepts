package Locks.StampedLock.OptimisticLock;

import java.util.concurrent.locks.StampedLock;

public class SharedResource {
    int a = 10;
    StampedLock lock = new StampedLock();

    public void producer() {
        System.out.println("0: " + a);
        long stamp = lock.tryOptimisticRead();
        try {
            System.out.println("Taken optimistic lock");
            a = 11;
            Thread.sleep(6000);
            System.out.println("1: " + a);
            if(lock.validate(stamp)) {      // this will tell us that if any write operation has been done
                System.out.println("Updated a value successfully");
                System.out.println("2: " + a);
            }
            else {
                System.out.println("Roll-back of work");
                a = 10; // rollback
                System.out.println("3: " + a);
            }
        } catch (Exception e) {
            //
        }   // no unlock in OptimisticLock as there is no lock
    }

    public void consumer() {
        long stamp = lock.writeLock();
        System.out.println("Write lock acquired by: " + Thread.currentThread().getName());
        try {
            System.out.println("performing work");
            a = 9;
            System.out.println("4: " + a);
        } catch(Exception e) {
            //
        } finally {
            lock.unlock(stamp);
            System.out.println("Write lock unlocked by: " + Thread.currentThread().getName());
        }
    }
}
