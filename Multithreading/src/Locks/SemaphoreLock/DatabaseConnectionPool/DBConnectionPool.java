package Locks.SemaphoreLock.DatabaseConnectionPool;

import java.util.concurrent.Semaphore;

// Consider a scenario where you need to manage a fixed number of database connections.
// Semaphores can be used to limit the number of threads accessing the database simultaneously.
public class DBConnectionPool {
    private static final int MAX_CONNECTIONS = 5;
    private final Semaphore semaphore = new Semaphore(MAX_CONNECTIONS, true);

    public void connect() {
        try {
            semaphore.acquire();
            System.out.println(Thread.currentThread().getName() + " acquired a database connection");
            // Simulate database operations
            Thread.sleep((long) (Math.random() * 4000));
            System.out.println(Thread.currentThread().getName() + " released a database connection");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
        }
    }

    public static void main(String[] args) {
        DBConnectionPool pool = new DBConnectionPool();

        for (int i = 0; i < 10; i++) {
            new Thread(pool::connect).start();
        }
    }
}

// In this example, the semaphore ensures that no more than five threads can access the database simultaneously.
