package Locks.ReadWriteLock;

import java.util.HashMap;
import java.util.Map;

// **IMPORTANT**
// Sometimes it is necessary for a thread that have read access to also obtain write access.
// For this to be allowed the thread must be the only reader

public class ReadToWriteReentrance {
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
        if(isOnlyReader(callingThread)) return true;
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

    private boolean isOnlyReader(Thread callingThread) {
        return readingThreads.size() == 1
                && readingThreads.get(callingThread) != null;
    }
}
