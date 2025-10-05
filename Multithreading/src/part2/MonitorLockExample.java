package part2;

public class MonitorLockExample {
    public synchronized void task1() {
        // do something
        try {
            System.out.println("Inside task1");
            Thread.sleep(10000);
            System.out.println("Task1 completed");
        } catch(Exception e) {
            // exception handling here
        }
    }

    public void task2() {
        System.out.println("task2, but before synchronized");
        synchronized (this) {
            System.out.println("task2, inside synchronized");
        }
    }

    public void task3() {
        System.out.println("task3");
    }
}
