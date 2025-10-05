package part1;

// Thread creation using Runnable Object
public class Main {
    public static void main(String[] args) {
        System.out.println("Going inside the main method: " + Thread.currentThread().getName());
        MultithreadingLearning runnableObj = new MultithreadingLearning();
        // runnableObj.run();
        Thread thread = new Thread(runnableObj);
        thread.start();
        System.out.println("Finish main method: " + Thread.currentThread().getName());
    }
}
