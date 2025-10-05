package part2;

// without using lambda
public class MonitorThread1Runnable implements Runnable {
    MonitorLockExample obj;

    MonitorThread1Runnable(MonitorLockExample obj) {
        this.obj = obj;
    }

    @Override
    public void run() {
        obj.task1();
    }
}
