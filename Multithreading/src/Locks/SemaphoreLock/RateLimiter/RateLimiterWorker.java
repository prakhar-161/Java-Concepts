package Locks.SemaphoreLock.RateLimiter;

import java.util.concurrent.Semaphore;

public class RateLimiterWorker {
    private final Semaphore semaphore;

    public RateLimiterWorker(int maxConcurrentRequests) {
        semaphore = new Semaphore(maxConcurrentRequests, true);
    }

    public void handleRequest() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " is handling a request.");
            // Simulate request processing
            Thread.sleep((long) (Math.random() * 1000));
            System.out.println(Thread.currentThread().getName() + " has finished handling the request.");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }

    public static void main(String[] args) {
        RateLimiterWorker rateLimiter = new RateLimiterWorker(3);

        for (int i = 0; i < 10; i++) {
            new Thread(rateLimiter::handleRequest).start();
        }
    }
}
