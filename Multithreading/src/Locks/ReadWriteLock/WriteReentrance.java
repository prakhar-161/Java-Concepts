package Locks.ReadWriteLock;
// refer https://jenkov.com/tutorials/java-concurrency/read-write-locks.html

// Write reentrance is granted only if the thread has already write access.

import java.util.HashMap;
import java.util.Map;

public class WriteReentrance {
    private Map<Thread, Integer> readingThreads = new HashMap<Thread, Integer>();
    private int writeAccesses = 0;
    private int writeRequests = 0;
    private Thread writingThread = null;

    public synchronized void lockWrite() throws InterruptedException {
        writeRequests++;
        Thread callingThread = Thread.currentThread();
        while(!canGrantWriteAccess(callingThread)) {
            wait();
        }
        writeRequests--;
        writeAccesses++;
        writingThread = callingThread;
    }

    public synchronized void unlockWrite() throws InterruptedException {
        writeAccesses--;
        if(writeAccesses == 0){
            writingThread = null;
        }
        notifyAll();
    }

    private boolean canGrantWriteAccess(Thread callingThread) {
        if(hasReaders()) return false;
        if(!isWriter(callingThread)) return false;
        if(writingThread == null) return true;
        return true;
    }

    private boolean isWriter(Thread callingThread) {
        return writingThread == callingThread;      // if same thread, then it can re-enter the lock
    }

    private boolean hasReaders() {
        return readingThreads.size() > 0;
    }
}

// Notice how the thread currently holding the write lock is now taken into account when determining if the calling thread can get write access.