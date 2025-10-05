package part3.DaemonThread;

public class SharedResource {
    boolean isAvailable = false;

    public synchronized void produce() {
        System.out.println("Lock acquired");        // 4
        isAvailable = true;
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            // handle exception here
        }
        System.out.println("Lock released");        // 5
    }
}
