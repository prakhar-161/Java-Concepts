package Locks.ReadWriteLock;

import java.util.HashMap;
import java.util.Map;

// **IMPORTANT**
// Sometimes a thread that has write access needs read access too. A writer should always be granted read access if requested.
// If a thread has write access no other threads can have read nor write access, so it is not dangerous.

public class WriteToReadReentrance {
    private Map<Thread, Integer> readingThreads = new HashMap<Thread, Integer>();
    private int writers = 0;
    private int writeRequests = 0;
    private Thread writingThread = null;

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
        if(isWriter(callingThread)) return true;        // can get read access
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

    private boolean isWriter(Thread callingThread) {
        return writingThread == callingThread;      // if same thread, then it can re-enter the lock
    }
}
