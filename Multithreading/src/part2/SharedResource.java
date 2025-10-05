package part2;

public class SharedResource {
    boolean itemAvailable = false;

    // synchronized puts the monitor lock
    public synchronized void addItem() {
        itemAvailable = true;
        System.out.println("Item added by: " + Thread.currentThread().getName() + " and invoking all the threads which are waiting");
        notifyAll();
    }

    public synchronized void consumeItem() {
        System.out.println("Consume item invoked by: " + Thread.currentThread().getName());

        // using while loop to avoid "spurious wake-up", sometimes because of system noise
        while(!itemAvailable) {
            try {
                System.out.println("Thread " + Thread.currentThread().getName() + " is waiting now");
                wait(); // it releases the monitor lock
            } catch (Exception e) {
                // handle exception here
            }
        }

        System.out.println("Item consumed by: " + Thread.currentThread().getName());
        itemAvailable = false;
    }
}
