package part2practise;

public class SharedResource {
    boolean isItemPresent = false;

    public synchronized void addItem() {
        isItemPresent = true;
        System.out.println("Producer thread calling the notify method");
        notifyAll();
    }

    public synchronized void consumeItem() {
        System.out.println("Consumer thread inside consumeItem method");
        while(!isItemPresent) {
            try {
                System.out.println("Consumer thread is waiting");
                wait();     // release all the monitor locks
            } catch (Exception e) {
                // handle exception here
            }
        }
        isItemPresent = false;
    }
}
