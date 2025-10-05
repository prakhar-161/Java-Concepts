package part3.ThreadJoining;

public class Main {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        System.out.println("Main thread started");      // 1

        Thread t1 = new Thread(() -> {
            System.out.println("Thread1 calling produce method");       // 3
            resource.produce();
        });

        t1.start();

        // we want thread1 to finish its task and then allow main thread to complete
        // main thread shouldn't be completing before thread1

        try {
            System.out.println("Main thread is waiting for thread1 to finish now");     // 2
            t1.join();
        } catch (Exception e) {
            // handle exception here
        }

        System.out.println("Main thread is finishing its work");        // 6
    }
}
