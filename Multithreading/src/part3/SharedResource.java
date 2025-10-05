package part3;

// case study for suspend() method usage problems
public class SharedResource {
    boolean isAvailable = false;

    public synchronized void produce() {
        System.out.println("Lock acquired");
        isAvailable = true;
        try {
            Thread.sleep(8000);
        } catch (Exception e) {
            // handle exception here
        }
        System.out.println("Lock released");
    }
}
