package Locks.SemaphoreLock.SemaphoreWorkerExample;
// refer this to learn: https://medium.com/javarevisited/semaphore-in-java-6824fe663975

import java.util.concurrent.Semaphore;

public class Worker implements Runnable {
    private final Semaphore semaphore;

    Worker(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        try {
            semaphore.acquire();    // Acquire a permit
            System.out.println(Thread.currentThread().getName() + " is working");
            Thread.sleep(3000);
            System.out.println(Thread.currentThread().getName() + " has finished");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();    // Release the permit
        }
    }
}
