package Locks.ReadWriteLock;
// refer https://jenkov.com/tutorials/java-concurrency/read-write-locks.html

// To make the ReadWriteLock reentrant for readers we will first establish the rules for read reentrance :-
// A thread is granted read reentrance if it can get read access (no writers or write requests),
// or if it already has read access (regardless of write requests).


import java.util.HashMap;
import java.util.Map;

public class ReadReentrance {
    private Map<Thread, Integer> readingThreads = new HashMap<Thread, Integer>();

    private int writers = 0;
    private int writeRequests = 0;

    public synchronized void lockRead() throws InterruptedException {
        Thread callingThread = Thread.currentThread();
        while(!canGrantReadAccess(callingThread)) {
            wait();
        }

        readingThreads.put(callingThread, (getReadAccessCount(callingThread) + 1));
    }

    public synchronized void unlockRead() throws InterruptedException {
        Thread callingThread = Thread.currentThread();
        int accessCount = getReadAccessCount(callingThread);
        if(accessCount == 1) {
            readingThreads.remove(callingThread);
        }
        else {
            readingThreads.put(callingThread, (accessCount -1));
        }
        notifyAll();
    }

    private boolean canGrantReadAccess(Thread callingThread) {
        if(writers > 0) return false;           // can't get read access
        if(writeRequests > 0) return false;     // can't get read access
        if(isReader(callingThread)) return true;        // can get read access
        return true;
    }

    private int getReadAccessCount(Thread callingThread) {
        Integer accessCount = readingThreads.get(callingThread);
        if(accessCount == null) return 0;
        return accessCount;
    }

    private boolean isReader(Thread callingThread) {
        return readingThreads.get(callingThread) != null;   // returns true if already read access
    }
}

// As you can see read reentrance is only granted if no threads are currently writing to the resource.
// Additionally, if the calling thread already has read access this takes precedence over any writeRequests.
