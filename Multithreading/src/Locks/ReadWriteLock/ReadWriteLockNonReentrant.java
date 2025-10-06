package Locks.ReadWriteLock;

// this readwritelock class is not reentrant
public class ReadWriteLockNonReentrant {
    private int readers = 0;
    private int writers = 0;
    private int writeRequests = 0;

    public synchronized void lockRead() throws InterruptedException {
        while(writers > 0 || writeRequests > 0) {
            wait();
        }
        readers++;
    }

    public synchronized void unlockRead() {
        readers--;
        notifyAll();
    }

    public synchronized void lockWrite() throws InterruptedException {
        writeRequests++;

        while(readers > 0 || writers > 0) {// if there is a reader or writer from before
            wait();
        }

        writeRequests--;
        writers++;
    }

    public synchronized  void unlockWrite() throws InterruptedException {
        writers--;
        notifyAll();
    }
}

// A situation on how this class is non-reentrant ------

// t1 -> read access == lockread (readers > 0 i.e. 1 now)
// t2 -> requests write access -> writeRequests++ i.e. writeRequests > 0
// t1 comes again -> need read access but can't since writeRequests > 0 already
// therefore, it would lock up -> deadlock like situation
