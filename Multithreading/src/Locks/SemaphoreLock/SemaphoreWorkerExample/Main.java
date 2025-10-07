package Locks.SemaphoreLock.SemaphoreWorkerExample;

import java.util.concurrent.Semaphore;

public class Main {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3,true);     // permits
        for(int i=0; i<6; i++) {
            new Thread(new Worker(semaphore)).start();
        }
    }
}


// at a time, only 3 threads have permits to access the critical section simultaneously due to semaphore's 3 permits.