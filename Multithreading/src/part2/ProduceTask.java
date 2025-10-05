package part2;

// without lambda method way
public class ProduceTask implements Runnable {
    SharedResource sharedResource;

    ProduceTask(SharedResource resource) {
        this.sharedResource = resource;
    }

    @Override
    public void run() {
        System.out.println("Producer thread: " + Thread.currentThread().getName());
        try {
            Thread.sleep(5000L);
        } catch (Exception e) {
            // handle exception here
        }

        sharedResource.addItem();
    }
}
